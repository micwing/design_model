package com.onekr.designmodel.singleton;

/**
 * Singleton(单例模式)
 * 
 定义 :
Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 

第一种形式：定义的时候就初始化(不推荐)。  
第二种形式:延迟初始化，使用的时候再初始化，效率较高(推荐)。  

实现的关键：

1. 将所有的构造函数都设为private ，而且必须显示的指定构造函数（不能设置为默认的，因为默认构造函数是package访问权限）。

2. 注意clone()方法。

    例如， 如果基类实现了cloneable接口的话，子类就应该重写该方法。当然，在应用中应该灵活运用各种方法来防止clone()的各种情况。


 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Factory1 factory1 = Factory1.getInstance();
		
		Factory2 factory2 = Factory2.getInstance();
	}
}
