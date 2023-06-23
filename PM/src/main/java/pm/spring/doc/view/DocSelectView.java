package pm.spring.doc.view;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import pm.spring.doc.dto.DocDTO;
import pm.spring.doc.service.DocServiceImp;

public class DocSelectView {

private static final Logger logger = LoggerFactory.getLogger(DocSelectView.class);

public static void main(String[] args) {
	ApplicationContext applicationContext = new GenericXmlApplicationContext(
			"file:src/main/webapp/WEB-INF/spring/root-context.xml");
	logger.info("정보", applicationContext);
	 DocServiceImp docServiceImp = (DocServiceImp) applicationContext.getBean("docServiceImp");
	 List<DocDTO> list = docServiceImp.documentSelectAll();
	logger.info("" + list);
	if(list.isEmpty()) {
		System.out.println("데이터가 없습니다.");
	}else {
		for(DocDTO docDTO:list) {
			System.out.println(docDTO);
		}
	}
}
}
