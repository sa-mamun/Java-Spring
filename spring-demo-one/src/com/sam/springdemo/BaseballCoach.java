package com.sam.springdemo;

import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min on batting practice";
		
	}

}
