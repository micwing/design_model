package com.onekr.designmodel.visitor;

/**
 * 观察者接口
 * 
 * @author Administrator
 * 
 */
public interface PersonVisitor {
	/**
	 * 腿
	 * 
	 * @param leg
	 */
	public void visitor(Leg leg);

	/**
	 * 手
	 * 
	 * @param hand
	 */
	public void visitor(Hand hand);
}
