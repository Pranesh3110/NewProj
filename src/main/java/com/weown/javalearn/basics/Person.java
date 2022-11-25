package com.weown.javalearn.basics;

public class Person {
	String name; 
	int age;
	String address;
	
	public Person() {
		
	}
	
	public Person(String name,int age ,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	 
	
	

}
