package com.onekr.designmodel.builder;

/**
 * builder制造者模式

当要生产的一种产品具有相同的结构，并且每个构件的生产都很繁杂，就可以用Builder模式将具体构件的生产与整个成品的组装分离开来。还是拿本文的代码来举例，生产一辆汽车，生产汽车的厂家不需要知道引擎怎么生产的，不需要关心轮胎怎么生产的，也不需要关心玻璃怎么生产的。当他在生产一辆车的时候，只会说，我要一块日本产的引擎，于是就有了日本产的引擎（至于日本引擎怎么生产的他不关心，他只要一个引擎的成品），他又说我要一块美国产的玻璃，于是就有了美国产的玻璃，这样直到他得到了所有的构件，然后他把这些构件组装起来，组成一个成品（汽车）卖给客户。这就是一个典型的Builder模式。

在main函数里面，director调用了builder里面的getProduct()方法，getProduct()方法实际就是组装的过程，getProduct()里面的buildGlass()，buildWheel()，buildEngine()就是在购买构件，而这些构件生产的具体过程放在了这些构件自身的类里面，可以看到buildGlass()里面有new一个对象，这就是在进行生产。这样就达到了组装和生产构件之间的分离。

最后，说说我对Builder模式和Factory模式之间区别的理解。我个人认为Builder和Factory之间的区别就是组装和生产之间的区别，Builder着重将组装和构件的生产分离，Factory着重于优化生产的过程。本文的代码实际上还可以进行重构，例如，在buildGlass()函数里面，用到了new这个关键字，实际上可以将这个new换成工厂类，让工厂类来生产Glass。换一种说法，就是Factory不进行组装，Builder进行组装，当Factory进行组装的时候，它就变成Builder了。

 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		CarBuilder builderA = new CarABuilder();
		CarBuilder builderB = new CarBBuilder();
		Director director;
		director = new Director(builderA);
		Car carA = director.construct();
		director = new Director(builderB);
		Car carB = director.construct();
		System.out.println("Car A is made by:" + carA.glass + carA.wheel
				+ carA.engine);
		System.out.println("Car B is made by:" + carB.glass + carB.wheel
				+ carB.engine);
	}
}
