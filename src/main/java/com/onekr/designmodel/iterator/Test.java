package com.onekr.designmodel.iterator;

import java.util.Vector;

/**
 * Iterator(迭代器模式)
 * 
 * 
 * 迭代器模式: 在软件构建过程中，集合对象内部结构常常变化各异。但对于这些集合对象，我们希望在不暴露其内部结构的同时，
 * 可以让外部客户代码透明地访问其中包含的元素;同时这种“透明遍历” 也为“同一种算法在多种集合对象上进行操作”提供了可能。
 * 使用面向对象技术将这种遍历机制抽象为“迭代器对象”为“应对变化中的集合对象”提供了一种优雅的方法。
 * 
 * 适用性： 1．访问一个聚合对象的内容而无需暴露它的内部表示。 2．支持对聚合对象的多种遍历。 3．为遍历不同的聚合结构提供一个统一的接口(即,
 * 支持多态迭代)。
 * 
 * 生活中的例子： 迭代器提供一种方法顺序访问一个集合对象中各个元素，而又不需要暴露该对象的内部表 示。在早期的电视机中，
 * 一个拨盘用来改变频道。当改变频道时，需要手工转动拨盘移过每一个 频道，而不论这个频道是否有信号。 现在的电视机，使用[后一个]和[前一个]按钮。当按下[后
 * 一个]按钮时，将切换到下一个预置的频道。 想象一下在陌生的城市中的旅店中看电视。当改变
 * 频道时，重要的不是几频道，而是节目内容。如果对一个频道的节目不感兴趣， 那么可以换下一个频道，而不需要知道它是几频道。
 * 
 * 
 * @author Administrator
 * 
 */
public class Test {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		Iterator<Integer> iterator = new ArrayIterator<Integer>(vector);
		iterator.add(1);
		iterator.add(2);
		iterator.add(3);
		iterator.add(4);
		iterator.add(5);
		iterator.add(6);
		while (iterator.isDone()) {
			System.out.println(iterator.next());
		}
	}
}
