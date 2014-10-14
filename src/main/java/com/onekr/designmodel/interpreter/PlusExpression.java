package com.onekr.designmodel.interpreter;

/**
 * 解释器具体实现类。
 * 
 * @author Administrator
 *
 */
public class PlusExpression extends AbstractExpression {
	public void interpret(Context context) {
		int input1 = context.getInput1();
		int input2 = context.getInput2();
		
		context.setOutput(input1 + input2);
	}
}
