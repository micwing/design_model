package com.onekr.designmodel.builder;

public class Director {
	private CarBuilder builder;

	public Director(CarBuilder builder) {
		this.builder = builder;
	}

	public Car construct() {
		return builder.getProduct();
	}
}
