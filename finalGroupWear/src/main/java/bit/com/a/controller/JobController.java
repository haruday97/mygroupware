package bit.com.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class JobController {
	
	@RequestMapping(value="adminJob.do", method=RequestMethod.GET)
	public String adminJob() {
		return "adminJob.tiles";
	}
	
	
}
