package com.onekr.designmodel.prototype;

/**
 * 
 * 

克隆满足的条件：
clone()方法将对象复制了一份并返还给调用者。一般而言，clone()方法满足以下的描述：
1、对任何的对象x,都有：x.clone() != x。换言之，克隆对象与原对象不是同一个对象。
2、对任何的对象x,都有：x.clone().getClass == x.getClass(),换言之，克隆对象与原对象的类型一样。
3、如果对象x的equals()方法定义恰当的话，那么x.clone().equals(x)应当是成立的。 

这种形式涉及到三个角色：
１、客户(Client)角色:客户类提出创建对象的请求。
２、抽象原因(Prototype)角色：这是一个抽象角色，通常由一个java接口或Java抽象类实现。此角色给出所有的具体原型类所需的接口。
３、具体原型(Concrete Prototype)角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口 


作为原型模式的第二种形式，它有如下的角色：
１、客户端(Client)角色：客户端类向管理员提出创建对象的请求。
２、抽象原型（Prototype)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体原型类所需的接口。
３、具体原型（Concrete Prototype)角色：被复制的对象。需要实现抽象的原型角色所要求的接口。
４、原型管理器(Prototype Manager)角色：创建具体原型类的对象，并记录每一个被创建的对象 
 * 
 * @author Administrator
 *
 */
public class Client {
	public void registerPrototype() {
		prototype = new ConcretePrototype();

		Prototype copytype = (Prototype) prototype.clone();

		mgr.add(copytype);
	}

	private PrototypeManager mgr;

	private Prototype prototype;
}
