package com.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Tyre tyre;
	
	public void drive() {
		System.out.println("in the car class " + tyre);
	}
}
