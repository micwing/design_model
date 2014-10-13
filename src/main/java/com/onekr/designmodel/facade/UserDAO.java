package com.onekr.designmodel.facade;

import java.util.List;

public interface UserDAO {
	public abstract List findByUserName(Object userName, Object passWord);

	public abstract List findByUserName(Object userName);

	public abstract List findByUserPassword(Object userPassword);

	public abstract List findByUserPortraitUrl(Object userPortraitUrl);

	public abstract List findByEmail(Object email);

	public abstract List findByUrl(Object url);

	public abstract List findByRole(Object role);
}
