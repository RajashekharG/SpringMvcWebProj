package com.spring.demo;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * The Class LoginController.
 *
 * @author Rajashekhar G
 */
@Controller
public class LoginController {

	
	@RequestMapping(value="/login.do")
	public String initLogin(HttpServletRequest req, HttpServletResponse resp) {
		try {
			System.out.println("entered");
		} catch (Exception e) {
			System.out.println("exception");
		}
		return "index";
	}
	
	
	
}
