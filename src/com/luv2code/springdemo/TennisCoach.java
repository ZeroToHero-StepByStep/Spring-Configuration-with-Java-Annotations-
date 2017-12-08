package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService ;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService ;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Pactice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

	// define a default constructor 
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	@Autowired
	public void doSomeCrazyStuff( FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService ;
	}
	
	
}
