package pm.spring.doc.view;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import pm.spring.doc.dto.DocDTO;
import pm.spring.doc.service.DocServiceImp;

public class DocInsertView {

private static final Logger logger = LoggerFactory.getLogger(DocInsertView.class);

public static void main(String[] args) {
	ApplicationContext applicationContext = new GenericXmlApplicationContext(
			"file:src/main/webapp/WEB-INF/spring/root-context.xml");
	logger.info("정보", applicationContext);
	 DocServiceImp docServiceImp = (DocServiceImp) applicationContext.getBean("docServiceImp");
	 DocDTO docDTO = new DocDTO();
	 docDTO.setDoc_no(2);
	 docDTO.setFk_writer_empno(1);
	 docDTO.setDoc_subject("sps");
	 docDTO.setDoc_contents("spring");
	 docDTO.setOrgFilename("ssss");
	 docDTO.setFileName("아아");
	 docServiceImp.documentInsert(docDTO);
	 List<DocDTO> list = docServiceImp.documentSelectAll();
	logger.info("" + list);
	for(DocDTO docDTO2:list) {
		System.out.println(docDTO2);
	}
}
}
