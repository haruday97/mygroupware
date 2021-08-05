package bit.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.ElecDocuDao;
import bit.com.a.dto.ElecDocuDto;
import bit.com.a.dto.SearchParam;

@Service
public class ElecDocuServImpl implements ElecDocuServ {
	
	@Autowired
	ElecDocuDao dao;
	
	@Override
	public List<ElecDocuDto> reportDocuList(SearchParam searchDocu) {
		return dao.reportDocuList(searchDocu);
	}

	@Override
	public List<ElecDocuDto> unreportDocuList(SearchParam searchDocu) {
		return dao.unreportDocuList(searchDocu);
	}

	@Override
	public int docuCutting(SearchParam searchDocu) {
		return dao.docuCutting(searchDocu);
	}

	@Override
	public List<ElecDocuDto> docu_Top5(ElecDocuDto docu) {
		return dao.docu_Top5(docu);
	}

	@Override
	public ElecDocuDto docuDetail(int docuSeq) {
		return dao.docuDetail(docuSeq);
	}

	@Override
	public boolean docuWrite(ElecDocuDto docu) {
		return dao.docuWrite(docu);
	}

	@Override
	public void docuRecall(int docuSeq) {
		dao.docuRecall(docuSeq);
	}
	
	@Override
	public void docuUpdate(ElecDocuDto docu) {
		dao.docuUpdate(docu);
	}

	

	@Override
	public void docuDelete(int docuSeq) {
		dao.docuDelete(docuSeq);
	}
	

}
