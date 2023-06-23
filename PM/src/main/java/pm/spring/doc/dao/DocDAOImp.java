package pm.spring.doc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import pm.spring.doc.dto.DocDTO;

@Repository
@RequiredArgsConstructor
public class DocDAOImp implements DocDAO {
	@Autowired
	private final SqlSessionTemplate sqlSessionTemplate;
	@Override
	public List<DocDTO> documentSelectAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("pm.spring.doc.selectAll");
	}

	@Override
	public void documentInsert(DocDTO docDTO) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("pm.spring.doc.insert", docDTO);
	}

	@Override
	public void documentUpdate(DocDTO docDTO) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update("pm.spring.doc.update", docDTO);
	}

	@Override
	public void documentDelete(int doc_no) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete("pm.spring.doc.delete", doc_no);
	}

	@Override
	public DocDTO documentSelect(int doc_no) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("pm.spring.doc.select", doc_no);
	}

}