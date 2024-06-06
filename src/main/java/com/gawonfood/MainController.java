package com.gawonfood;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(HttpServletRequest request, Model model) throws Exception {
		try {
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "main"; //servlet-context.xml의 prefix + suffix붙어서 풀url
	}
};
