package com.onekr.designmodel.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Interpreter - 解释器模式 
Interpreter是一种特殊的设计模式，它建立一个解释器，对于特定的计算机程序设计语言，用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释器构架。

Interpreter模式的应用场合是interpreter模式应用中的难点，只有满足"业务规则频繁变化，且类似的模式不断重复出现，并且容易抽

象为语法规则的问题"才适合使用Interpreter模式。


使用Interpreter模式来表示文法规则，从而可以使用面向对象技巧来方便地“扩展”文法。

    
Interpreter模式比较适合简单的文法表示，对于复杂的文法表示，Interpreter模式会产生比较大的类层次结构，这时候就不应该采用Interpreter模式了。


效率不是一个关键问题最高效的解释器通常不是通过直接解释语法分析树实现的，而是首先将它们转换成另一种形式。
例如：正则表达式通常被转换成状态机。但即使在这种情况下，转换器仍可用解释器模式实现，该模式仍是有用的。

 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context(10, 3);

		List list = new ArrayList();

		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());

		for (int i = 0; i < list.size(); i++) {
			AbstractExpression expression = (AbstractExpression) list.get(i);
			expression.interpret(context);
			System.out.println(context.getOutput());
		}

	}
}
