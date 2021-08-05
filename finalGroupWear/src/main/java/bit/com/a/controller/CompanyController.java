package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bit.com.a.dto.CompanyDto;
import bit.com.a.dto.SearchParam;
import bit.com.a.service.CompanyService;


@Controller
public class CompanyController {
	
	@Autowired
	CompanyService service;
	
	@RequestMapping(value="adminCompany.do", method=RequestMethod.GET)
	public String adminCompany(SearchParam sp, Model model) {
		
		int nowPage = sp.getPageNumber();
		int start = nowPage * 10 + 1;
		int end = (nowPage + 1) * 10 ;
		sp.setStart(start);
		sp.setEnd(end);
		List<CompanyDto> comList = service.getAllCps(sp);
		int totalCp = service.getCpCount(sp);
		
		model.addAttribute("comList", comList);
		model.addAttribute("totalCp", totalCp);
		model.addAttribute("pageNumber", nowPage + 1);
		model.addAttribute("category",sp.getCategory());
		model.addAttribute("search", sp.getSearch());
//		model.addAttribute("search1", sp.getSearch1());
		
		return "adminCompany.tiles";
	}
	
	@RequestMapping(value="adminCompanyDetail.do", method=RequestMethod.GET)		
	public String adminCompanyDetail(CompanyDto comDto, Model model) {
		
	return "adminCompanyDetail.tiles";
	}
	@RequestMapping(value="adminCompanyAdd.do", method=RequestMethod.GET)
	public String adminCompanyAdd(CompanyDto comDto, Model model) {
		
	return "adminCompanyAdd.tiles";
	}
	
	@RequestMapping(value="adminCompanyModify.do", method=RequestMethod.GET)
	public String adminCompanyModify(CompanyDto comDto, Model model) {
		
	return "adminCompanyModify.tiles";
	}
	
//	후처리
	
	@RequestMapping(value="addCompany.do", method=RequestMethod.GET)
	public String addCompany(CompanyDto comDto, Model model) {
	System.out.println(comDto.toString());
	service.addCp(comDto);
	return "redirect:/adminCompany.do";
	}
	
	@RequestMapping(value="modifyCompany.do", method=RequestMethod.GET)
	public String modifyCompany(CompanyDto comDto, Model model) {
		
	return "adminCompanyModify.tiles";
	}
	
	@RequestMapping(value="deleteCompany.do", method=RequestMethod.GET)
	public String deleteCompany(CompanyDto comDto, Model model) {
		
	return "adminCompanyModify.tiles";
	}
	
	@RequestMapping(value="reviveCompany.do", method=RequestMethod.GET)
	public String reviveCompany(CompanyDto comDto, Model model) {
		
	return "adminCompanyModify.tiles";
	}
//	getCpName
	@ResponseBody
	@RequestMapping(value="comNameCheck.do", method=RequestMethod.GET)
	
	public String comNameCheck(String comName, Model model) {
		int res = service.getCpName(comName);
		
	return res>0?"exist":"possible";
	}
	
}