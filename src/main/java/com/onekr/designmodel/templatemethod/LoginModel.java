package com.onekr.designmodel.templatemethod;

/**
 * 封装进行登陆控制所需要的数据
 * 
 * @author Administrator
 *
 */
public class LoginModel {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
