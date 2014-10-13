package com.onekr.designmodel.simplefactory;

/**
 * 具体产品角色ConcreteProduct
 * 
 * @author Administrator
 *
 */
public class Plane implements Movable {

	public void move() {
		System.out.println("plane fly");
	}

}
