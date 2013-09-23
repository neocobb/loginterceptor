package com.senthil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoggerImplementation {

	public void testMethod1(){
		System.out.println("testMethod1");
	}
	
	public String testMethod2(){
		System.out.println("testMethod2");
		return "os";
	}
	
	public static void main(String[] args){
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		 LoggerImplementation impl = (LoggerImplementation) ctx.getBean("test");
		 impl.testMethod1();
		 impl.testMethod2();
	}
}
