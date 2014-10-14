package com.onekr.designmodel.templatemethod;

/**
 * 登陆控制的模板
 * 
 * @author Administrator
 * 
 */
public abstract class LoginTemplate {

	/**
	 * 根据用户ID来获取存储中的相应数据
	 * 
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public abstract LoginModel findLoginUser(String userId);

	/**
	 * 对密码进行加密,（钩子方法--被子类覆以扩展功能）
	 * 
	 * @param password
	 *            密码数据
	 * @return 加密后 的密码数据
	 */
	public String encryptPwd(String password) {
		return password;
	}

	/**
	 * 判断登陆数据与数据库中的数据是否匹配
	 * 
	 * @param lm
	 * @param dblm
	 * @return
	 */
	public boolean match(LoginModel lm, LoginModel dblm) {
		if (lm.getUserId().equals(dblm.getUserId())
				&& lm.getPassword().equals(dblm.getPassword())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断登陆是否登陆成功
	 * 
	 * @param lm
	 *            封装登陆的数据
	 * @return
	 */
	public final boolean login(LoginModel lm) {
		LoginModel dblm = this.findLoginUser(lm.getUserId());
		if (dblm != null) {
			String encryPwd = this.encryptPwd(lm.getPassword());
			lm.setPassword(encryPwd);
			return this.match(lm, dblm);
		}
		return false;
	}
}
