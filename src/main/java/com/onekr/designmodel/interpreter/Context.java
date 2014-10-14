package com.onekr.designmodel.interpreter;

/**
 * 解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等。
 * 
 * @author Administrator
 * 
 */
public class Context {
	private int input1;
	private int input2;
	private int output;

	public Context(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

}
