package bit.com.a.service;

import java.util.List;

import bit.com.a.dto.CompanyDto;
import bit.com.a.dto.SearchParam;

public interface CompanyService {
	
	List<CompanyDto> getAllCps(SearchParam sp);
	CompanyDto getCp(int comCode);
	int getCpCount(SearchParam sp);
	void addCp(CompanyDto comDto);
	void editCp(CompanyDto comDto);
	void delCp(CompanyDto comDto);
	int getCpName(String comName);
}
