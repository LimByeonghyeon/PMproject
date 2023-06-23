package pm.spring.doc.dao;

import java.util.List;

import pm.spring.doc.dto.DocDTO;

public interface DocDAO {
	public List<DocDTO> documentSelectAll();
	public void documentInsert(DocDTO docDTO);
	public void documentUpdate(DocDTO docDTO);
	public void documentDelete(int doc_no);
	public DocDTO documentSelect(int doc_no);
	
//	public boolean documentEmail(int doc_no, String email);
//	
//	public List<?> documentSearch(String keyword, String keyfield, int page, int limit);
//	public int documentSearchCount(String keyword, String keyfield);
//	public int documentCount();
}