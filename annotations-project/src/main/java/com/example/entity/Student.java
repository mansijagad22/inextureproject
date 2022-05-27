package com.example.entity;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	String m;

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}
}
