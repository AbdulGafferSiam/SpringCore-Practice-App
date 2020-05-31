package com.springproject.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("config loaded");

		Sim sim = context.getBean("sim", Sim.class);
		
		sim.calling();
		sim .data();
	}

}
