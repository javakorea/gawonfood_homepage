package com.gawonfood;

import java.util.ArrayList;

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
			PlazaAcademyApplySO reserveInfo = new PlazaAcademyApplySO();
			
			reserveInfo.setCusGbCd("50");
			map.addAttribute("reserveInfo", reserveInfo);
			
			ArrayList newArr = new ArrayList();
			newArr.add("김길동");
			newArr.add("홍길동");
			newArr.add("홍길동");
			map.addAttribute("newArr", newArr);
			
			ArrayList newMemArr = new ArrayList();
			for(int i=0; i < 3; i++) {
				PlazaAcademyApplySO member = new PlazaAcademyApplySO();
				member.setCusGbCd("코드"+i);
				member.setName("혜진"+i);
				newMemArr.add(member);
			}
			map.addAttribute("memberArr", newMemArr);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "/mypage/plaza/include/myAcademyList"; //servlet-context.xml의 prefix + suffix붙어서 풀url
	}
	
	@RequestMapping(value = "xhr/mypage/digitalplaza/academy/getLoginInfo.do", method = RequestMethod.POST)
	public String getLoginInfo(PlazaAcademyApplySO so, ModelMap map) throws Exception {
		try {
			PlazaAcademyApplySO userInfo = new PlazaAcademyApplySO();
			userInfo.setUserId(so.getUserId());
			userInfo.setUserPw(so.getUserPw());
			map.addAttribute("userInfo", userInfo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "/mypage/plaza/include/loginsuccess"; //servlet-context.xml의 prefix + suffix붙어서 풀url
	}
};
