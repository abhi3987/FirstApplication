package com.firstApplication.Annotation.firstApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// ioc
		// Di

		/*Airtel obj = new Airtel(); // tigh
		obj.topUpAmount();
		obj.stateName();
		obj.Subscription();
		
		Jio jo = new Jio();
		jo.stateName();*/
		
		ClassPathXmlApplicationContext amit = new ClassPathXmlApplicationContext("com/firstApplication/Annotation/firstApplication/ApplicationContext.xml");
		Jio obj =  (Jio) amit.getBean("jio");
		obj.stateName();
		
		Airtel manu = (Airtel) amit.getBean("airtel");
		manu.topUpAmount();
	    
		manu.Subscription();
		
		Subscription avinash=(Subscription) amit.getBean("subs");
		avinash.getAmazonPrime();
		
	}
}
