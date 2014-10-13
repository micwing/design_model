package com.onekr.designmodel.builder;

public interface CarBuilder {
	public void buildGlass();

	public void buildWheel();

	public void buildEngine();

	public Car getProduct();
}
