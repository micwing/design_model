package com.onekr.designmodel.builder;

public class CarBBuilder implements CarBuilder {
	private Car product;

	public CarBBuilder() {
		product = new Car();
	}

	/**
	 * 将建造部件的工作封装在getProduct()操作中,主要是为了向客户隐藏实现细节 这样，具体建造类同时又起到了一个director的作用
	 */
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		product.engine = new FranceEngine();
	}

	@Override
	public void buildGlass() {
		// TODO Auto-generated method stub
		product.glass = new JapaneseGlass();
	}

	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		product.wheel = new AmericanWheel();
	}

	@Override
	public Car getProduct() {
		// TODO Auto-generated method stub
		buildGlass();
		buildWheel();
		buildEngine();
		return product;
	}
}