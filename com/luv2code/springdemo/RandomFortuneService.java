package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String [] data = {"Today is your lucky Day", "You will get a lottery today", "There will be a surprining opportunity in your workfront"};
	

	@Override
	public String getFortune() {
		Random random = new Random();
	    int index =  random.nextInt(3);
		return data[index];
	}

}
