package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"The cut trolley persists beside ",
			"The coincidence hangs a ",
			"Next to the dip resides the pending "
	};
	
	
	// create a random number generator 
	private Random myRandom = new Random() ;
	
	
	@Override
	public String getFortune() {
		// pick	a random string from the array 
		int index = myRandom.nextInt(data.length) ;
		String fortune = data[index] ;
		return fortune;
	}
	
	

}
