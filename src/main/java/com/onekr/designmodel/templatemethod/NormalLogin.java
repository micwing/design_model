package com.onekr.designmodel.templatemethod;

/**
 * 普通用户登陆控制的逻辑处理
 * 
 */
public class NormalLogin extends LoginTemplate {

	@Override
	public LoginModel findLoginUser(String userId) {
		LoginModel lm = new LoginModel();
		lm.setUserId(userId);
		lm.setPassword("testpwd");
		return lm;
	}
}