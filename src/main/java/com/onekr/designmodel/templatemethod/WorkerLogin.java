package com.onekr.designmodel.templatemethod;

/**
 * 工作人员登陆控制的逻辑处理
 * 
 */
public class WorkerLogin extends LoginTemplate {

	@Override
	public LoginModel findLoginUser(String userId) {
		LoginModel lm = new LoginModel();
		lm.setUserId(userId);
		lm.setPassword("workerpwd");
		return lm;
	}

	/**
	 * 覆盖父类的方法，提供真正的加密实现
	 */
	@Override
	public String encryptPwd(String password) {
		System.out.println("使用MD5进行加密");
		return password;
	}
}
