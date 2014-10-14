package com.onekr.designmodel.strategy;

/**
 * 抽象折扣类
 * 
 * @author Administrator
 * 
 */
public interface MemberStrategy {
	/**
	 * 计算图书的价格
	 * 
	 * @param booksPrice
	 *            图书的原价
	 * @return 计算出打折后的价格
	 */
	public double calcPrice(double booksPrice);
}
