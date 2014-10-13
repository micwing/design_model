package com.onekr.designmodel.simplefactory;

/**
 * 
 * 简单工厂模式
 * 
Simple Factory模式根据提供给它的数据，返回几个可能类中的一个类的实例。通常它返回的类都有一个公共的父类和公共的方法。
Simple Factory模式实际上不是GoF 23个设计模式中的一员。

工厂类角色Creator (MovableFactory)：工厂类在客户端的直接控制下（Create方法）创建产品对象。

抽象产品角色Product (Movable)：定义简单工厂创建的对象的父类或它们共同拥有的接口。可以是一个类、抽象类或接口。

具体产品角色ConcreteProduct (Car, Plane)：定义工厂具体加工出的对象。



优点：
工厂类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例，客户端可以免除直接创建产品对象的责任，而仅仅"消费"产品。简单工厂模式通过这种做法实现了对责任的分割。

缺点：
当产品有复杂的多层等级结构时，工厂类只有自己，以不变应万变，就是模式的缺点。因为工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响。

同时，系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，有可能造成工厂逻辑过于复杂。

另外，简单工厂模式通常使用静态工厂方法，这使得无法由子类继承，造成工厂角色无法形成基于继承的等级结构。

 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		MovableFactory factory = new MovableFactory();
		Movable m1 = factory.create("car");
		Movable m2 = factory.create("plane");
		m1.move();
		m2.move();
	}
}
