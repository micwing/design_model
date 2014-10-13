package com.onekr.designmodel.prototype;

/**
 * 
 * 
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
