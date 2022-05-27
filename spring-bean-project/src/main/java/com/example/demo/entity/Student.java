package com.example.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Student {

	private int id;
	private String name;

	public void getId() {
		System.out.println("Your Name : " + id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getName() {
		System.out.println("Your Name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

}
