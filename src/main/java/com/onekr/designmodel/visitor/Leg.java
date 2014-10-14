package com.onekr.designmodel.visitor;

public class Leg implements Visable {
	/**
	 * 可以接受访问的方法
	 * 
	 * @param visitor
	 */
	public void accept(PersonVisitor visitor) {
		visitor.visitor(this);
	}
}
