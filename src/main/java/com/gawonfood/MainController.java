package com.gawonfood;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gawonfood.so.PlazaAcademyApplySO;

@Controller
public class MainController {

	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main(HttpServletRequest request, Model model) throws Exception {
		try {
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "main"; //servlet-context.xml의 prefix + suffix붙어서 풀url
	}
	
	@RequestMapping(value = "xhr/mypage/digitalplaza/academy/getMyAcademyList.do", method = RequestMethod.POST)
	public String getMyAcademyList(PlazaAcademyApplySO so, ModelMap map) throws Exception {
		try {
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "mypage/plaza/include/myAcademyList"; //servlet-context.xml의 prefix + suffix붙어서 풀url
	}
};
