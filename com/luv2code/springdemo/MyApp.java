package com.luv2code.springdemo;

import java.util.Random;

public class MyApp {
	
	private String [] fortuneList = new String[3];
	
	public MyApp() {
		fortuneList[0] = "Today is your lucky Day";
		fortuneList[1] = "You will get a lottery today";
		fortuneList[2] = "There will be a surprining opportunity in your workfront";
	}

	public static void main(String[] args) {
		//Coach theCoach = new TrackCoach();
		//System.out.println(theCoach.getDailyWorkout());
		MyApp app = new MyApp();
		System.out.println("Random Fortune" + app.getRandomFortune());
	}
	
	private String getRandomFortune() {
		Random random = new Random();
	    int randomNum =  random.nextInt(3);
	    System.out.println("Random Number " + randomNum);
		return fortuneList[randomNum];
	}

}
