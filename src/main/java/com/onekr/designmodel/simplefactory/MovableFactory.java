package com.onekr.designmodel.simplefactory;

/**
 * 工厂类角色Creator
 * 
 * @author Administrator
 *
 */
public class MovableFactory {

	public Movable create(String type) {
		if (type.equals("car")) {			
			return new Car();
		} else if (type.equals("plane")) {			
			return new Plane();
		}
		return null;
	}
	
}
