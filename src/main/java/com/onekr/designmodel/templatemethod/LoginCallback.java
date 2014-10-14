package com.onekr.designmodel.templatemethod;

/**
 * 登陆控制的模板方法需要的回调接口，需要把所有需要的接口方法都定义出来 或是所有需要被扩展的方法都要被定义出来
 * 
 */
public interface LoginCallback {
	/**
	 * 根据登陆编号来查找和获取数据库中相应的数据
	 * 
	 * @param loginId
	 * @return LoginModel 对象
	 */
	public LoginModel findLoginUser(String userId);

	/**
	 * 对密码进行加密
	 * 
	 * @param password
	 * @param template
	 *            LoginTemplate2 对象
	 * @return 加密后的密码
	 */
	public String encrytPwd(String password, LoginTemplate2 template);

	/**
	 * 判断用户填写的登陆数据是否和数据库中的数据匹配
	 * 
	 * @param lm
	 *            用户填写的登陆数据
	 * @param dbLm
	 *            数据库中的数据
	 * @param template
	 *            LoginTemplate2 对象
	 * @return true表示匹配成功，false表示匹配失败
	 */
	public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate2 template);

}
