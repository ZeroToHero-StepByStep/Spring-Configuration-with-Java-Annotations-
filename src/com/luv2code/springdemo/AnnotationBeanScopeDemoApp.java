package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach coach = context.getBean("tennisCoach" , Coach.class) ;
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class) ;
		
		// check if they are the same object 
		boolean result = (coach == alphaCoach ) ;
		System.out.println("Pointing to the same object:" + result) ;
		
		System.out.println("Memory location for the Coach" + coach) ;
		System.out.println("Memory location for the alphaCoach" + alphaCoach) ;
		
		// close the context
		context.close();
		
				
		

	}

}
