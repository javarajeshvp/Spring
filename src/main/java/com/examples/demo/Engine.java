package com.examples.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.examples.demo.util.Output;
@Component
@Scope("prototype")
public class Engine {
	private int id;
	private int cylinders;
	String type;

	

	public Engine() {
		Output.print("Engine Object Created");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void start() {
		Output.print("Running Engine [id=" + id + ", cylinders=" + cylinders + ", type=" + type + "]");
	}
}
