package com.onekr.designmodel.facade;

public class UserServiceImp implements UserService {
	private UserDAO userDao;

	public void setUserDAO(UserDAO userDao) {
		this.userDao = userDao;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public boolean login(String userName, String passWord) {
		if (userDao.findByUserName(userName, passWord) != null) {
			// 合法用户，登录成功。
			return true;
		} else {
			// 登录失败。
			return false;
		}
	}
}
