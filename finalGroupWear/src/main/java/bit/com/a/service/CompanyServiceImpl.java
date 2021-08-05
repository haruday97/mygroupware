package bit.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.CompanyDao;
import bit.com.a.dto.CompanyDto;
import bit.com.a.dto.SearchParam;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyDao dao;

	@Override
	public List<CompanyDto> getAllCps(SearchParam sp) {
		return dao.getAllCps(sp);
	}

	@Override
	public CompanyDto getCp(int comCode) {
		return dao.getCp(comCode);
	}

	@Override
	public int getCpCount(SearchParam sp) {
		return dao.getCpCount(sp);
	}

	@Override
	public void addCp(CompanyDto comDto) {
		dao.addCp(comDto);
	}

	@Override
	public void editCp(CompanyDto comDto) {
		dao.editCp(comDto);
	}

	@Override
	public void delCp(CompanyDto comDto) {
		dao.delCp(comDto);
	}

	@Override
	public int getCpName(String comName) {
		return dao.getCpName(comName);
	}

}
