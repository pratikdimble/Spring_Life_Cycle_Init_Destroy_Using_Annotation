package com.app.annotation_config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class model  {
	private int id;
	private String name;
	public model() {
		super();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("\t\t***YOU ARE IN INIT");
	}
	@PreDestroy
	public void destroy() {
		
		System.out.println("\t\t***YOU ARE IN DESTROY");
	}
	
	
	@Override
	public String toString() {
		return "model [id=" + id + ", name=" + name + "]";
	}

	
}
