package com.onekr.designmodel.proxy;

/**
 * 
代理模式（Proxy Pattern）

代理模式是常用的Java 设计模式，它的特征是代理类与委托类有同样的接口，代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类，以及事后处理消息等。代理类与委托类之间通常会存在关联关系，一个代理类的对象与一个委托类的对象关联，代理类的对象本身并不真正实现服务，而是通过调用委托类的对象的相关方法，来提供特定的服务。

NormalProxyTest展示了普通的代理模式

 * @author Administrator
 *
 */
public class NormalProxyTest {
	public static void main(String[] args) {
		Dao jdbcDao = new JdbcDao();
		Dao proxydao = new ProxyDao(jdbcDao);
		proxydao.insert();
	}
}

interface Dao {
	public void insert();
}

class JdbcDao implements Dao {
	public void insert() {
		System.out.println("in jdbc insert");
	}
}

class HibernateDao implements Dao {
	public void insert() {
		System.out.println("in hibernate insert");
	}
}

class ProxyDao implements Dao {
	private Dao dao;

	public ProxyDao(Dao dao) {
		this.dao = dao;
	}

	public void insert() {
		System.out.println("write log before invoke");
		dao.insert();
		System.out.println("write log after invoke");
	}
}