package com.digient.gitesh.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="person")
public class Person {
	
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		id=101;
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
