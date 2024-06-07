package com.gawonfood.so;

import org.springframework.stereotype.Component;

@Component
public class PlazaAcademyApplySO {
	public String name ="";
	public String age = "";
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
