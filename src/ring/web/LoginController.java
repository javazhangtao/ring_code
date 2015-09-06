package ring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ring.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	@RequestMapping("")
	@ResponseBody
	public void login(final HttpServletRequest request , final HttpServletResponse response , final HttpSession session){
	}
	
}
