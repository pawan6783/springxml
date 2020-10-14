package com.example.springxml;

public class TennisCoach implements MyCoach{
	private FortuneService fortuneService;
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getExercise() {
		// TODO Auto-generated method stub
		return "Do tennis practice for 2 hrs.";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
