package com.onekr.designmodel.adapter;

/**
 * 适配器
 * BAdapter使用了对象的适配器模式
 * 
 * @author Administrator
 *
 */
public class BAdapter implements Target{

	private Adaptee adaptee = new Adaptee();

	@Override
	public int get110v() {
		return adaptee.get220v()/2;
	}

	@Override
	public int get220v() {
		return adaptee.get220v();
	}
	
	
}
