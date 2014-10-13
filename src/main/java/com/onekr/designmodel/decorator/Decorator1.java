package com.onekr.designmodel.decorator;

public class Decorator1 implements Sourcable {
	private Sourcable sourcable;

	public Decorator1(Sourcable sourcable) {
		super();
		this.sourcable = sourcable;
	}

	public void operation() {
		System.out.println("第一个装饰器前");
		sourcable.operation();
		System.out.println("第一个装饰器后");
	}
}