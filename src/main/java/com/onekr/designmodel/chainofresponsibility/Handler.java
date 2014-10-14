package com.onekr.designmodel.chainofresponsibility;

/**
 * 定义职责对象的接口
 * @author Administrator
 *
 */
public abstract class Handler {
	protected Handler successor;

	/**
	 * 设置下一个处理请求对象
	 * 
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	/**
	 * 处理聚餐费用的申请
	 * 
	 * @param user
	 *            申请人
	 * @param fee
	 *            申请的费用
	 * @return
	 */
	public abstract String handlerFeeRequest(String user, double fee);
}
