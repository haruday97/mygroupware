package bit.com.a.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import bit.com.a.dto.NoticeDto;
import bit.com.a.service.NoticeService;
import bit.com.a.util.NoticeUtil;

@Controller
public class NoticeController {

	@Autowired
	NoticeService service;
	
	@RequestMapping(value = "noticelist.do", method = RequestMethod.GET)
	public String noticelist(Model model) {
		model.addAttribute("doc_title", "공지사항 목록");
		
		List<NoticeDto> list = service.getNoticeList();
		model.addAttribute("noticelist", list);
		
		return "noticelist.tiles";		
	}
	
	@RequestMapping(value = "noticewrite.do", method = RequestMethod.GET)
	public String noticewrite(Model model) {
		//model.addAttribute("doc_title", "글쓰기");
		
		return "noticewrite.tiles";
	}
	
	@RequestMapping(value = "noticeupload.do", method = RequestMethod.POST)
	public String noticeupload(NoticeDto noticedto,
							@RequestParam(value = "fileload", required = false)
							MultipartFile fileload,
							HttpServletRequest req) {
		
		// filename(원본) 취득
		String filename = fileload.getOriginalFilename();
		noticedto.setFilename(filename);	
		
		String fupload = req.getServletContext().getRealPath("/upload");
		System.out.println("fupload:" + fupload);
		
		// 파일명 변경
		String newfilename = NoticeUtil.getNewFileName(noticedto.getFilename());
		noticedto.setNewfilename(newfilename);
		
		File file = new File(fupload + "/" + newfilename);
		
		try {
			// 실제로 업로드
			FileUtils.writeByteArrayToFile(file, fileload.getBytes());
			
			// DB에 저장
			service.uploadNotice(noticedto);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "redirect:/noticelist.do";
	}
	
	@RequestMapping(value = "fileDownload.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String fileDownload(String newfilename, String filename, int seq, 
				HttpServletRequest req, Model model) {
		
		// 경로
		// server
		String fupload = req.getServletContext().getRealPath("/upload");
		
		File downloadFile = new File(fupload + "/" + newfilename);
		
		model.addAttribute("downloadFile", downloadFile);
		model.addAttribute("originalFile", filename);
		model.addAttribute("seq", seq);
				
		return "downloadView";
	}
	
	@RequestMapping(value = "noticedetail.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String noticedetail(int seq, Model model) {
		//model.addAttribute("doc_title", "글보기");
		
		// dto 취득
		NoticeDto noticedto = service.getNotice(seq);
		model.addAttribute("notice", noticedto);
		
		return "noticedetail.tiles";
	}
	
	
	
	@RequestMapping(value = "noticeupdate.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String noticeupdate(int seq, Model model) {
		//model.addAttribute("doc_title", "글 수정");
		
		// dto 취득
		NoticeDto noticedto = service.getNotice(seq);
		model.addAttribute("notice", noticedto);
		
		return "noticeupdate.tiles";
	}
	
	@RequestMapping(value = "noticeupdateAf.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String noticeupdateAf(NoticeDto noticedto, 
								String namefile,	// 기존의 파일 명,
								HttpServletRequest req,
								@RequestParam(value = "fileload", required = false)MultipartFile fileload) {
		
		noticedto.setFilename(fileload.getOriginalFilename());
		
		// 파일 경로
		String fupload = req.getServletContext().getRealPath("/upload");
		
		// 수정할 파일이 있음
		if(noticedto.getFilename() != null && !noticedto.getFilename().equals("")) {
			
			String f = noticedto.getFilename();
			String newfilename = NoticeUtil.getNewFileName(f);
			
			noticedto.setFilename(f);
			noticedto.setNewfilename(newfilename);
			
			File file = new File(fupload + "/" + newfilename);			
			
			try {
				// 실제 업로드
				FileUtils.writeByteArrayToFile(file, fileload.getBytes());
				
				// db 경신
				service.updateNotice(noticedto);		
				
			} catch (IOException e) {				
				e.printStackTrace();
			}			
		}
		else {	// 수정할 파일 없음
			
			// 기존의 파일명으로 설정
			noticedto.setFilename(namefile);
			
			// DB
			service.updateNotice(noticedto);
		}
		
		return "redirect:/noticelist.do";
	}
}








