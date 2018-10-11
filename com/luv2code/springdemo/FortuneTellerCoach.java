package com.luv2code.springdemo;

public class FortuneTellerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FortuneTellerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Fortune telling everyday";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
