package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.ElecDocuDto;
import bit.com.a.dto.SearchParam;
import bit.com.a.service.ElecDocuServ;


@Controller
public class hansulController {
	@Autowired
	ElecDocuServ service;
	
	// test
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("doc_title", "LOG IN");
		return "login.tiles";
	}
	
	@RequestMapping(value="formtest.do", method=RequestMethod.GET)
	public String main() {
		return "formtest.tiles";
	}
	
	@RequestMapping(value="realMain.do", method=RequestMethod.GET)
	public String realMain() {
		return "realMain.tiles";
	}
	
	
	// 전자문서
	@RequestMapping(value="docuMyList.do", method=RequestMethod.GET)
	public String docuMyWrite(Model model) {
		model.addAttribute("doc_title", "문서결재현황");
		return "docuMyList.tiles";
	}
	
	
	
	// 1-1. 상신문서 리스트
	@RequestMapping(value="docuReportList.do", method=RequestMethod.GET)
	public String docuReportList(Model model, SearchParam searchDocu) {
		model.addAttribute("doc_title", "작성문서관리");
		
		int sn = searchDocu.getPageNumber();	// 0 1 2 3 4
		int start = 1 + sn * 10;	// 1  11
		int end = (sn + 1) * 10;	// 10 20 
		
		searchDocu.setStart(start);
		searchDocu.setEnd(end);
		
		List<ElecDocuDto> list = service.reportDocuList(searchDocu);
		model.addAttribute("reportDocuList", list);
		
		int totalCount = service.docuCutting(searchDocu);
		model.addAttribute("totalCount", totalCount);
		
		model.addAttribute("pageNumber", searchDocu.getPageNumber() + 1);
		
		model.addAttribute("search", searchDocu.getSearch());
		model.addAttribute("category", searchDocu.getCategory());
		return "docuReportList.tiles";
	}
	
	// 1-2. 미상신문서 리스트
	@RequestMapping(value="docuUnreportList.do", method=RequestMethod.GET)
	public String docuUneportList(Model model, SearchParam searchDocu) {
		model.addAttribute("doc_title", "작성문서관리");
		
		int sn = searchDocu.getPageNumber();	// 0 1 2 3 4
		int start = 1 + sn * 10;	// 1  11
		int end = (sn + 1) * 10;	// 10 20 
		
		searchDocu.setStart(start);
		searchDocu.setEnd(end);
		
		List<ElecDocuDto> list = service.unreportDocuList(searchDocu);
		model.addAttribute("unreportDocuList", list);
		
		int totalCount = service.docuCutting(searchDocu);
		model.addAttribute("totalCount", totalCount);
		
		model.addAttribute("pageNumber", searchDocu.getPageNumber() + 1);
		
		model.addAttribute("search", searchDocu.getSearch());
		model.addAttribute("category", searchDocu.getCategory());
		return "docuUneportList.tiles";
	}

	
	
	
	
	
}
