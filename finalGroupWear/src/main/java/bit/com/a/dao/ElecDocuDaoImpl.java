package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.ElecDocuDto;
import bit.com.a.dto.SearchParam;

@Repository
public class ElecDocuDaoImpl implements ElecDocuDao {
	@Autowired
	SqlSession session;
	String ns = "hansul.";
	
	@Override
	public List<ElecDocuDto> reportDocuList(SearchParam searchDocu) {
		return session.selectList(ns+"report_docu_list", searchDocu);
	}

	@Override
	public List<ElecDocuDto> unreportDocuList(SearchParam searchDocu) {
		// TODO Auto-generated method stub
		return session.selectList(ns+"unreport_docu_list", searchDocu);
	}

	@Override
	public int docuCutting(SearchParam searchDocu) {
		return session.selectOne(ns+"docu_cutting", searchDocu);
	}

	@Override
	public List<ElecDocuDto> docu_Top5(ElecDocuDto docu) {
		return session.selectList(ns+"docu_top5", docu);
	}

	@Override
	public ElecDocuDto docuDetail(int docuSeq) {
		return session.selectOne(ns+"docu_detail", ns);
	}

	@Override
	public boolean docuWrite(ElecDocuDto docu) {
		int writeSuccess = session.insert(ns+"docu_write", docu);
		return writeSuccess>0?true:false;
	}

	@Override
	public void docuRecall(int docuSeq) {
		session.update(ns+"docu_recall", docuSeq);
	}
	
	@Override
	public void docuUpdate(ElecDocuDto docu) {
		session.update(ns+"update_unreported", docu);
	}
	
	@Override
	public void docuDelete(int docuSeq) {
		session.delete(ns+"delete_unreported", docuSeq);
	}

	

}
