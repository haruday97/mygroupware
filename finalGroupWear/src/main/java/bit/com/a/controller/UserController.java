package bit.com.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value="adminUser.do", method=RequestMethod.GET)
	public String adminUser() {
		return "adminUser.tiles";
	}

}
