package com.example;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorMethod implements BeanPostProcessor{
	public Object processBeforeInitialization(Object bean,String name) {
		System.out.println("Before Initialization : "+name);
		return bean;
	}
	public Object process(Object bean,String name) {
		System.out.println("After Initialization : "+name);
		return bean;
	}
}
