package bit.com.a.service;

import java.util.List;

import bit.com.a.dto.ElecDocuDto;
import bit.com.a.dto.SearchParam;

public interface ElecDocuServ {

	// 상신, 미상신 - 리스트 각각 불러오기
	List<ElecDocuDto> reportDocuList(SearchParam searchDocu);
	List<ElecDocuDto> unreportDocuList(SearchParam searchDocu);
		
	// 상신, 미상신 - (공통) 리스트 개수 세기, 최근5개 노출
	int docuCutting(SearchParam searchDocu);
	List<ElecDocuDto> docu_Top5(ElecDocuDto docu);
	
	// 글 내용 보기
	ElecDocuDto docuDetail(int docuSeq);
	
	// 글내용 작성, 회수, 수정, 삭제
	boolean docuWrite(ElecDocuDto docu);

	void docuRecall(int docuSeq);
	void docuUpdate(ElecDocuDto docu);
	void docuDelete(int docuSeq);
	
		
		
}
