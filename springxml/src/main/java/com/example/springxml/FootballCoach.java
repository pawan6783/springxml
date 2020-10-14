package com.example.springxml;

public class FootballCoach implements MyCoach{
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	
	}

	public String getExercise() {
		// TODO Auto-generated method stub
		return "Do football training for 3 hrs.";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
