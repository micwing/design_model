package com.onekr.designmodel.adapter;

/**
 * 

适配器模式（Adapter Pattern）
把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。

两种形式
a.类的适配器模式 b.对象的适配器模式

模拟问题：



 *
 */
public class Client {
	public static void main(String rags[]) {
		new Client().test();
	}

	public void test() {
		Target targeta = new AAdapter();
		int v1 = targeta.get110v();
		int v2 = targeta.get220v();
		
		Target targetb = new BAdapter();
		int v3 = targetb.get110v();
		int v4 = targetb.get220v();
	}
}
