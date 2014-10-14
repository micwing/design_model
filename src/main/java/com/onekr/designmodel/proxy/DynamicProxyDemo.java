package com.onekr.designmodel.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		System.out.println("===Without Proxy===");
		real.operation1();
		real.operation2("ZJ");
		
		System.out.println("===Use Proxy===");
		Subject proxy = (Subject) Proxy.newProxyInstance(
				Subject.class.getClassLoader(), new Class[] { Subject.class },
				new DynamicProxyHandler(real));
		proxy.operation1();
		proxy.operation2("ZJ");
	}
}
