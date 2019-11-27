package com.sam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.print(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
