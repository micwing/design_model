package com.onekr.designmodel.chainofresponsibility;

/**
 * 总经理审批
 * 
 */
public class GeneralManager extends Handler {

	@Override
	public String handlerFeeRequest(String user, double fee) {
		String str = "";

		if (fee >= 1000) {
			if ("Joe".equals(user)) {
				str = "General manager agreed " + user
						+ "'s request, the fee is $" + fee;
			} else {
				str = "General manager didn't agree " + user + "'s request.";
			}
			return str;
		}
		// next to others.
		if (this.successor != null) {
			return successor.handlerFeeRequest(user, fee);
		}
		return str;
	}
}