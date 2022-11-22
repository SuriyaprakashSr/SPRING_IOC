package com.ty.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
   @Autowired

	items items;
	
	public void using() {
		items.used();
	}
}
