package com.onekr.designmodel.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Visitor(访问者模式) 

表示一个作用于某对象结构中的各元素的操作。它使你可以在
不改变各元素类的前提下定义作用于这些元素的新操作。从定义可以看出结构对象是使用访问者模式必备
条件，而且这个结构对象必须存在遍历自身各个对象的方法。这便类似于Java语言当中的collection概念了。

涉及角色 ：
　　1.IVisitor 抽象访问者角色，为该对象结构中具体元素角色声明一个访问操作接口。该操作接口的名字和
参数标识了发送访问请求给具休访问者的具休元素角色，这样访问者就可以通过该元素角色的特定接口直接访问它。
　　2.ConcreteVisitor.具体访问者角色，实现Visitor声明的接口。
　　3.Element 定义一个接受访问操作(accept())，它以一个访问者(Visitor)作为参数。
　　4.ConcreteElement 具体元素，实现了抽象元素(Element)所定义的接受操作接口。
　　5.ObjectStructure 结构对象角色，这是使用访问者模式必备的角色。它具备以下特性：
能枚举它的元素；可以提供一个高层接口以允许访问者访问它的元素；如有需要，可以设计成一个
复合对象或者一个聚集（如一个列表或无序集合）。
　　访问者模式的几个特点：
　　访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
　　访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。
若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
　　访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中
到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。
　　适用情况 ：
　　1) 一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
　　2) 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。
Visitor模式使得你可以将相关的操作集中起来 定义在一个类中。
　　3) 当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
　　4) 定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。改变对象结构类需要重定义对所有访
问者的接口，这可能需要很大的代价。如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。

 * @author Administrator
 *
 */
public class VisitorMain {
	public static void main(String[] args) {
		Hand hand = new Hand("i am a hand");
		Leg leg = new Leg();
		Visitor visitor = new Visitor();
		leg.accept(visitor);
		hand.accept(visitor);
		
		List cons = new ArrayList();
		cons.add(leg);
		cons.add(hand);
		visitor.visitorCollections(cons);
	}
}
