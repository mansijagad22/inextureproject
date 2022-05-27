package com.example.entity;

public class Student {
	String message;

	 public void getMessage(){
	      System.out.println("My Message : " + message);
	   }

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		 System.out.println("Bean is going through init.");
		System.out.println("Init method is called...");
	}
	public void destroy() {
		System.out.println("Bean will destroy now.");
		System.out.println("Destroy method is called...");
	}
}
