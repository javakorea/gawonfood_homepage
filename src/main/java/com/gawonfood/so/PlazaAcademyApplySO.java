package com.gawonfood.so;

import org.springframework.stereotype.Component;

@Component
public class PlazaAcademyApplySO {
	public String name ="";
	public String age = "";
	public String cusGbCd = "";
	public String userId = "";
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String userPw = "";
	
	public String getCusGbCd() {
		return cusGbCd;
	}
	public void setCusGbCd(String cusGbCd) {
		this.cusGbCd = cusGbCd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
