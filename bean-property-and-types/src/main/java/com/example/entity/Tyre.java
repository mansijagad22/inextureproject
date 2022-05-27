package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
// 	created a constructor to configure in xml file
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "working in tyre entity class";
	}
	

}
