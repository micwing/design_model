package com.onekr.designmodel.chainofresponsibility;

/**
 * 项目经理审批
 * 
 */
public class ProjectManager extends Handler {

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str = "";

		if (fee < 500) {
			if ("Joe".equals(user)) {
				str = "Project manager agreed " + user
						+ "'s request, the fee is $" + fee;
			} else {
				str = "Project manager didn't agree " + user + "'s request.";
			}
			return str;
		}
		// more than $500, next to others.
		if (this.successor != null) {
			return successor.handlerFeeRequest(user, fee);
		}
		return str;
	}
}
