package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.NoticeDto;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	SqlSession session;
	
	String ns = "Notice.";

	@Override
	public List<NoticeDto> getNoticeList() {		
		return session.selectList(ns + "getNoticeList");
	}

	@Override
	public boolean uploadNotice(NoticeDto dto) {
		int n = session.insert(ns + "uploadNotice", dto);
		return n>0?true:false;
	}
	
	@Override
	public NoticeDto getNotice(int seq) {		
		return session.selectOne(ns + "getNotice", seq);		
	}
	
	@Override
	public boolean updateNotice(NoticeDto dto) {
		int n = session.update(ns + "updateNotice", dto);
		return n>0?true:false;
	}

	@Override
	public void readcount(int seq) {
		session.update(ns + "readcount", seq);
	}

	@Override
	public void downcount(int seq) {
		session.update(ns + "downcount", seq);
	}
	
}
