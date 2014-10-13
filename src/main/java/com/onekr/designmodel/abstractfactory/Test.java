package com.onekr.designmodel.abstractfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * abstract factory 抽象工厂模式

抽象工厂模式面对的问题是多产品等级结构的系统设计。
在学习抽象工厂具体实例之前，应该明白两个重要的概念：产品族和产品等级。
产品族：是指位于不同产品等级结构中，功能相关联的产品组成的家族。比如AMD的CPU和ADM芯片的主板，组成一个家族。Intel的CPU和Intel芯片的主板，又组成一个家族。而这两个家族都来自于两个产品等级：CPU，主板。一个等级结构是由相同的结构的产品组成


    AbstractProduct: 抽象产品，它们都有可能有两种不同的实现。
    ConcreteProduct:包括ProductA和ProductB， 对两个抽象产品的具体分类的实现。
    AbstractFactory: 抽象工厂接口，它里面应该包含所有的产品创建的抽象方法。
    ConcreteFactory: 包括MagicFactory和DefaultFactory，具体的工厂，创建具有特定实现的产品对象。
    
    
    抽象工厂模式优点：

第一，易于交换产品系列，由于具体工厂类，例如AbstractFactory factory = new MagicFactory()，在一个应用中只需要在初始化的时候出现一次，这就使得改变一个应用的具体工厂变得非常容易，它之需要改变具体工厂即可使用不同的产品配置。
第二，它让具体的创建实例与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离，不会出现在客户端代码中。

 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//通过spring配置bean来切换工厂
		BeanFactory context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AbstractFactory f = (AbstractFactory) context.getBean("v");
		Vehicle v = f.createVehicle();
		v.run();
		Weapon w = f.createWeapon();
		w.shoot();
		Food a = f.createFood();
		a.printName();
	}
}
