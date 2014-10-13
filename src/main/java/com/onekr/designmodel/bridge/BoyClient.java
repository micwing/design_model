package com.onekr.designmodel.bridge;

/**
 * Bridge桥接模式
将抽象和行为划分开来,各自独立,但能动态的结合.

为什么使用?
通常,当一个抽象类或接口有多个具体实现(concrete subclass),这些concrete之间关系可能有以下两种:
1. 这多个具体实现之间恰好是并列的,如前面举例,打桩,有两个concrete class:方形桩和圆形桩;这两个形状上的桩是并列的,没有概念上的重复,那么我们只要使用继承就可以了.

2.实际应用上,常常有可能在这多个concrete class之间有概念上重叠.那么需要我们把抽象共同部分和行为共同部分各自独立开来,原来是准备放在一个接口里,现在需要设计两个接口,分别放置抽象和行为.

所以，当一个类的子类需要扩展时，如果要在两个维度进行扩展，那么就可以使用Bridge模式。

 * @author Administrator
 *
 */
public class BoyClient {
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pursue(MM mm) {
		//这样就可以实现不同类型礼物和具体礼物之间的组合啦~
		Gift g = new WarmGift(new Flower());
		Gift g2 = new WildGift(new Ring());
	}
	
}
