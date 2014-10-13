package com.onekr.designmodel.factorymethod;

/**
 * 具体产品角色ConcreteProduct
 * 
 * @author Administrator
 *
 */
public class Car implements Movable{

	public void move() {
		System.out.println("car run");
	}

}
