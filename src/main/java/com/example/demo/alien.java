package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("value=Prototype")
public class alien {
	private int aid;
	private int aname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private laptop Laptop;
	
	
	
	
	public laptop getLaptop() {
		return Laptop;
	}
	public void setLaptop(laptop laptop) {
		Laptop = laptop;
	}
	public alien() {
		super();
		System.out.println("object created");
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getAname() {
		return aname;
	}
	public void setAname(int aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public void show() {
		System.out.println("in show");
		Laptop.compile();
	}
}
