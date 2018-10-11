package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
	}

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it " + fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
