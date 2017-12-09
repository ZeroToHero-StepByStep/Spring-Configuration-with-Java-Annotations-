package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		// read spring java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class) ; 
		
		// get the bean spring container
		Coach coach = context.getBean("tennisCoach", Coach.class) ;
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout()) ;
		
		// call method to get daily fortune 
		System.out.println(coach.getDailyFortune());
		
		// close the context 
		context.close();
		
	}
}
