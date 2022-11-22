package com.ty.annotation_value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value("pinky")
	private String name;
	@Value("ABC SCHOOl")
	private String School;
	public String getName() {
		return name;
	}
	public String getSchool() {
		return School;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSchool(String school) {
		School = school;
	}

}
