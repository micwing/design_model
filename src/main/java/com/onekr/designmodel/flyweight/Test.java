package com.onekr.designmodel.flyweight;

/**
 * FlyWeight享元模式

当一个应用中使用了大量的对象，这些对象造成了很大的存储开销，而对象的大部分状态或参数都是相同（内部状态）的时候，可以考虑使用享元模式，使用享元模式可以是这些对象引用都共享相同的实例，降低存储开销，而对象之间的不同的状态参数(外部状态)则使用外部参数传入来实现。

享元模式的核心思想就是将内部状态相同的对象在存储时进行缓存。

享元模式仍然允许对象具有外部属性，由于我们访问的始终是对象缓存的版本，所以我们在使用对象前，必须将外部状态重新注入对象。由于享元模式禁止生成新的对象，所以在使用享元模式时，通常伴随着工厂方法的应用。

 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		WebSite wb1 = WebSiteFactory.createWebSite("BusinessWebSite");
		User user1 = new User("root", "root");
		wb1.use(user1);

		WebSite wb2 = WebSiteFactory.createWebSite("BusinessWebSite");
		User user2 = new User("admin", "admin");
		wb2.use(user2);

		WebSite wb3 = WebSiteFactory.createWebSite("BusinessWebSite");
		User user3 = new User("slave", "slave");
		wb3.use(user3);

		WebSite wb4 = WebSiteFactory.createWebSite("PersonalWebSite");
		User user4 = new User("person", "person");
		wb4.use(user4);

		WebSite wb5 = WebSiteFactory.createWebSite("PersonalWebSite");
		User user5 = new User("alexis", "alexis");
		wb5.use(user5);

		WebSite wb6 = WebSiteFactory.createWebSite("PersonalWebSite");
		User user6 = new User("shadow", "shadow");
		wb6.use(user6);

		System.out.println("WebSites Instances Count: "
				+ WebSiteFactory.webSitesCount());
	}
}
