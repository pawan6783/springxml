package com.example.springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	MyCoach coach1 = context.getBean("MyCoach",MyCoach.class);
    	MyCoach coach2 = context.getBean("MyCoach",MyCoach.class);
    	System.out.println(coach1.getExercise());
    	System.out.println(coach1.getDailyFortune());
    	System.out.println(coach1==coach2);
    	
    	TennisCoach coach = context.getBean("TennisCoach",TennisCoach.class);
    	System.out.println(coach.getExercise());
    	System.out.println(coach.getDailyFortune());
    	System.out.println(coach.getName());
    	System.out.println(coach.getAge());
    	context.close();
    }
}
