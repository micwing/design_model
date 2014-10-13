package com.onekr.designmodel.facade;

/**

Facade模式

主要是为子系统中的一组接口提供一个统一的接口。Facade模式定义了一个更高的接口，使子系统更加容易使用。它的意图要求一个一致的高层接口。

 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		UserService facade = new UserServiceImp();
	}
}
