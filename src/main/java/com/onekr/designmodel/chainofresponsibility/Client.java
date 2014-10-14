package com.onekr.designmodel.chainofresponsibility;

/**
 * Chain of Responsibility(职责链)
 * 

Chain of Responsibility(CoR) 是用一系列类(classes)试图处理一个请求request,这些类之间是一个松散的耦合,唯一共同点是在他们之间传递request. 也就是说，来了一个请求，A类先处理，如果没有处理，就传递到B类处理，如果没有处理，就传递到C类处理，就这样象一个链条(chain)一样传递下去。

CoR的优点：
因为无法预知来自外界（客户端）的请求是属于哪种类型，每个类如果碰到它不能处理的请求只要放弃就可以。

缺点是效率低，因为一个请求的完成可能要遍历到最后才可能完成，当然也可以用树的概念优化。 在Java AWT1.0中，对于鼠标按键事情的处理就是使用CoR,到Java.1.1以后，就使用Observer代替CoR

扩展性差，因为在CoR中，一定要有一个统一的接口Handler.局限性就在这里。

与Command模式区别：

Command 模式需要事先协商客户端和服务器端的调用关系，比如 1 代表 start 2 代表 move 等，这些 都是封装在 request 中，到达服务器端再分解。

CoR 模式就无需这种事先约定，服务器端可以使用 CoR 模式进行客户端请求的猜测，一个个猜测 试验。 

 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Handler h1 = new ProjectManager();
		Handler h2 = new DepManager();
		Handler h3 = new GeneralManager();

		h2.setSuccessor(h3);
		h1.setSuccessor(h2);

		String ret1 = h1.handlerFeeRequest("Joe", 300);
		System.out.println(ret1);
		String ret2 = h1.handlerFeeRequest("Yoyo", 300);
		System.out.println(ret2);

		String ret3 = h1.handlerFeeRequest("Joe", 800);
		System.out.println(ret3);
		String ret4 = h1.handlerFeeRequest("Yoyo", 800);
		System.out.println(ret4);

		String ret5 = h1.handlerFeeRequest("Joe", 1300);
		System.out.println(ret5);
		String ret6 = h1.handlerFeeRequest("Yoyo", 1300);
		System.out.println(ret6);
	}
}
