package bit.com.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DepartmentController {
	
	@RequestMapping(value="adminDepartment.do", method=RequestMethod.GET)
	public String adminDepartment() {
		return "adminDepartment.tiles";
	}
	
	
}
