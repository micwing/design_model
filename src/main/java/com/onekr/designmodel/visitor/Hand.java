package com.onekr.designmodel.visitor;

public class Hand implements Visable {
	private String name;

	public Hand(String name) {
		this.name = name;
	}

	/**
	 * 可以接受访问的方法
	 * 
	 * @param visitor
	 */
	public void accept(PersonVisitor visitor) {
		visitor.visitor(this);
	}

	String getHand() {
		return this.name;
	}
}