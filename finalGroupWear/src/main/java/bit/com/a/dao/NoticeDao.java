package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.NoticeDto;

public interface NoticeDao {

	List<NoticeDto> getNoticeList();
	
	boolean uploadNotice(NoticeDto dto);
	
	NoticeDto getNotice(int seq);
	
	void readcount(int seq);
	
	boolean updateNotice(NoticeDto dto);
	
	void downcount(int seq);
}
