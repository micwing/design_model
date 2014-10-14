package com.onekr.designmodel.chainofresponsibility;

/**
 * 部门经理审批
 * 
 */
public class DepManager extends Handler {

	@Override
	public String handlerFeeRequest(String user, double fee) {

		String str = "";

		if (fee < 1000) {
			if ("Joe".equals(user)) {
				str = "Department manager agreed " + user
						+ "'s request, the fee is $" + fee;
			} else {
				str = "Department manager didn't agree " + user + "'s request.";
			}
			return str;
		}
		// more than $1000, next to others.
		if (this.successor != null) {
			return successor.handlerFeeRequest(user, fee);
		}
		return str;
	}
}