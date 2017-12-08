package com.web;

public class HelloBean {

	private String name;

	// Class is required default constructor.
	public HelloBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHello() {
		String hello = null;
		if (name == null) {
			hello = "Hello every body";
		} else {
			hello = "Hello" + name;
		}
		hello += ":Backend";
		return hello;
	}

}