package com.onekr.designmodel.templatemethod;

/**
 * 
 * 

Java 回调
java 回调技术，通过回调在接口中的方法，调用到具体的实现类中的方法，其本质是利用Java的动态绑定技术。在这种实现中，可以不把实现类写成单独的类，而是使用匿名内部类来实现回调方法。
应用Java回调技术来实现模板方法模式，在实际开发中使用的也非常多，也算是模板方法的一种变形吧。


 * @author Administrator
 *
 */
public class Client2 {
	public static void main(String[] args) {

		// 准备的登陆数据
		LoginModel lm = new LoginModel();
		lm.setUserId("admin");
		lm.setPassword("workpassword");
		LoginTemplate2 template = new LoginTemplate2();

		// 普通人员登陆
		boolean flag = template.login(lm, new LoginCallback() { // 匿名内部类

					@Override
					public LoginModel findLoginUser(String userId) {
						// 这里省略具体的处理（从数据库中获取数据对象），返回一默认的数据对象
						LoginModel lm = new LoginModel();
						lm.setUserId(userId);
						lm.setPassword("testpwd");
						return lm;
					}

					@Override
					public String encrytPwd(String password,
							LoginTemplate2 template) {
						// 自己不需要覆盖，直接调用模板中的默认实现
						return template.encryptPwd(password);
					}

					@Override
					public boolean match(LoginModel lm, LoginModel dbLm,
							LoginTemplate2 template) {
						// 自己不需要覆盖，直接调用模板中的默认实现
						return template.macth(lm, dbLm);
					}
				});
		System.out.println("用户：" + lm.getUserId() + " 登陆普通人员平台 = " + flag);

		// 工作人员登陆
		boolean flag2 = template.login(lm, new LoginCallback() {

			@Override
			public LoginModel findLoginUser(String userId) {
				LoginModel lm = new LoginModel();
				lm.setUserId(userId);
				lm.setPassword("workpassword");
				return lm;
			}

			@Override
			public String encrytPwd(String password, LoginTemplate2 template) {
				// 覆盖父类中的方法，提供真正的加密实现
				// 对密码进行加密，比如MD5,3DES等，省略了
				System.out.println("使用MD5进行密码加密");
				return password;
			}

			@Override
			public boolean match(LoginModel lm, LoginModel dbLm,
					LoginTemplate2 template) {
				// 自己不需要覆盖，直接调用模板中的默认实现
				return template.macth(lm, dbLm);
			}
		});
		System.out.println("用户：" + lm.getUserId() + " 登陆工作平台 = " + flag2);
	}
}
