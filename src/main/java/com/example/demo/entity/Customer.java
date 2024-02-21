package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String place;
	
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", place=" + place + ", age=" + age + "]";
	}

	public Customer(Integer id, String name, String place, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.age = age;
	}

	public Customer() {
		super();
	}
}
