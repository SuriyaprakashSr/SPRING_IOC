package com.ty.autowired.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	@Qualifier("english")
	Subjects subjects;
	
	public void subjectStudying() {
		subjects.subject();
	}

}
