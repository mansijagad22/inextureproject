package com.example.entity;

public class SpellChecker {
	private int num;
	private String name;
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor...");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void checkSpelling() {
		System.out.println("Inside of SpellChecker class and method check spelling...");
	}
}
