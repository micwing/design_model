package com.onekr.designmodel.decorator;

/**
 * 
 * 
 Decorator装饰器
动态地给一个对象添加一些额外的职责



饰器模式具有如下的特征：

    它必须具有一个装饰的对象。

    它必须拥有与被装饰对象相同的接口。

    它可以给被装饰对象添加额外的功能。
    
    
    
    装饰器通过包装一个装饰对象来扩展其功能，而又不改变其接口，这实际上是基于对象的适配器模式的一种变种。它与对象的适配器模式的异同点如下。

    相同点：都拥有一个目标对象。

    不同点：适配器模式需要实现另外一个接口，而装饰器模式必须实现该对象的接口。

 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Sourcable source = new Source();
		// 装饰类对象
		Sourcable obj = new Decorator1(new Decorator2(new Decorator3(source)));
		obj.operation();
	}
}
