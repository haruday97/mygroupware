package bit.com.a.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.CompanyDto;
import bit.com.a.dto.SearchParam;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	@Autowired
	SqlSessionTemplate session;
	String ns = "Company.";
	@Override
	public List<CompanyDto> getAllCps(SearchParam sp) {
		// TODO returns list of all company's DTO where at its current page.
		return session.selectList(ns + "getAllCps", sp);
	}
	@Override
	public CompanyDto getCp(int comCode) {
		return session.selectOne(ns + "getCp", comCode);
	}
	@Override
	public int getCpCount(SearchParam sp) {
		return session.selectOne(ns + "getCpCount", sp);
	}
	@Override
	public void addCp(CompanyDto comDto) {
		session.insert(ns + "addCp", comDto);
	}
	@Override
	public void editCp(CompanyDto comDto) {
		session.update(ns + "editCp", comDto);
	}
	@Override
	public void delCp(CompanyDto comDto) {
		session.update(ns + "delCp", comDto);
	}
	@Override
	public int getCpName(String comName) {
		return session.selectOne(ns + "getCpName", comName);
	}
	
}
