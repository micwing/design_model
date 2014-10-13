package com.onekr.designmodel.factorymethod;

/**
 * 具体工厂（Concrete Creator）
 * 
 * @author Administrator
 *
 */
public class PlaneFactory implements Factory{

	public Movable create() {
		return new Plane();
	}
	
}
