package com.onekr.designmodel.builder;

public class CarABuilder implements CarBuilder {
	private Car product = null;

	public CarABuilder() {
		product = new Car();
	}

	/**
	 * 将建造部件的工作封装在getProduct()操作中,主要是为了向客户隐藏实现细节 这样，具体建造类同时又起到了一个director的作用
	 */
	public void buildEngine() {
		// TODO Auto-generated method stub
		product.engine = new ChineseEngine();
	}

	@Override
	public void buildGlass() {
		// TODO Auto-generated method stub
		product.glass = new AmericanGlass();
	}

	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		product.wheel = new JapaneseWheel();
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
