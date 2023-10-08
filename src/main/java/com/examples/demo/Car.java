package com.examples.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.examples.demo.util.Output;

@Component
@Scope("prototype")
public class Car {
	private String vin;
	private String model;
	@Autowired
	private Engine engine;

	public Car() {
		Output.print("Car Object Created");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void run() {
		engine.start();
		Output.print("Running Car [vin=" + vin + ", model=" + model + "]");
	}

}
