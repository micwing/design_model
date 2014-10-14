package com.onekr.designmodel.strategy;

/**
 * 中级会员折扣类
 * 
 * @author Administrator
 *
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于中级会员的折扣为10%");
		return booksPrice * 0.9;
	}

}