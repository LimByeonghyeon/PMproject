package pm.spring.doc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pm.spring.doc.dao.DocDAO;
import pm.spring.doc.dto.DocDTO;

@Service
public class DocServiceImp implements DocService {
	private final DocDAO docDAO;
	public DocServiceImp(@Qualifier("docDAOImp") DocDAO docDAO) {
		this.docDAO = docDAO;
		
	}
	@Override
	public List<DocDTO> documentSelectAll() {
		// TODO Auto-generated method stub
		return docDAO.documentSelectAll();
	}

	@Override
	public void documentInsert(DocDTO docDTO) {
		// TODO Auto-generated method stub
		docDAO.documentInsert(docDTO);
	}

	@Override
	public void documentUpdate(DocDTO docDTO) {
		// TODO Auto-generated method stub
		docDAO.documentUpdate(docDTO);
	}

	@Override
	public void documentDelete(int doc_no) {
		// TODO Auto-generated method stub
		docDAO.documentDelete(doc_no);
	}

	@Override
	public DocDTO documentSelect(int doc_no) {
		// TODO Auto-generated method stub
		return docDAO.documentSelect(doc_no);
	}

}