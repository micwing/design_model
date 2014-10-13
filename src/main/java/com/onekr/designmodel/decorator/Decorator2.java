package com.onekr.designmodel.decorator;

public class Decorator2 implements Sourcable {
	private Sourcable sourcable;

	public Decorator2(Sourcable sourcable) {
		super();
		this.sourcable = sourcable;
	}

	public void operation() {
		System.out.println("第二个装饰器前");
		sourcable.operation();
		System.out.println("第二个装饰器后");
	}
}