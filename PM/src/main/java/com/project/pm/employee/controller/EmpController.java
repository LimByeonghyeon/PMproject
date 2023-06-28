package com.project.pm.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.pm.employee.model.EmpDAO;
import com.project.pm.employee.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@Autowired
	private EmpDAO dao;
	
	@ResponseBody 
	@RequestMapping(value = "/getEmpList.pm", produces="text/plain;charset=UTF-8")
	public String getEmpList( HttpServletRequest request ) {
		
		String keyword = request.getParameter("keyword");
		Map<String,String> empMap = new HashMap<String, String>();
		
		if(keyword == null) {
			keyword="";
		}
		empMap.put("keyword", keyword);
	    
		List<Map<String,String>> empList = service.getEmpList(empMap);
		
	    
		JSONArray jsonArr = new JSONArray();
		
		if(empList.size() != 0) {
			for(Map<String,String> EmpMap: empList) {
				
				JSONObject jsonObj = new JSONObject();
				
				jsonObj.put("empno",EmpMap.get("empno")); // 사번
				jsonObj.put("profile_color",EmpMap.get("profile_color")); // 프로필 아이콘 색상
				jsonObj.put("profileName", EmpMap.get("name").substring(1)); // 프로필이름 
				jsonObj.put("name", EmpMap.get("name")); // 이름 
				jsonObj.put("status", EmpMap.get("status")); // 재직상태
				jsonObj.put("hireDate", EmpMap.get("hiredate")); // 입사일
				jsonObj.put("retireDate", EmpMap.get("retiredate")); // 퇴사일
				jsonObj.put("continuousServiceMonth", EmpMap.get("continuousServiceMonth")); // 근속기간
				jsonObj.put("workingDays",EmpMap.get("workingDays")); // 근무일수
				jsonObj.put("dept", EmpMap.get("dept")); // 부서
				jsonObj.put("position", EmpMap.get("position")); // 직위
				jsonObj.put("email", EmpMap.get("email")); // 이메일
				jsonObj.put("gender", EmpMap.get("gender")); // 성별
				jsonObj.put("mobile", EmpMap.get("mobile")); // 핸드폰번호
				jsonObj.put("deptname", EmpMap.get("deptname")); // 부서명
				
				jsonArr.put(jsonObj);
				
			}
		}
		
		return jsonArr.toString();
	}

}
