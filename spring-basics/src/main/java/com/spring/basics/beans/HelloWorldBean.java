package com.spring.basics.beans;

public class HelloWorldBean {

	private String message = "";
	
	public void getMessage() {
		System.out.println("Bean Message :- " + message);
	}
	
	public void setMessage(String aMessage) {
		message = aMessage;
	}
	
}
