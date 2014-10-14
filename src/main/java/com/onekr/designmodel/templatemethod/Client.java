package com.onekr.designmodel.templatemethod;

/**
 * 
 * 模板方法模式（TemplateMethod）  
定义：定义一个操作中的算法骨架，而将一些步骤延迟到子类中去实现，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
功能：固定算法骨架，让具体算法可实现扩展。
优点：实现代码的复用。

对设计原则的体现：
● 开闭原则：“变与不变”，把不变的部分抽取出来，定义到父类中，比如算法骨架，一些公共的、固定的实现等。这些不变的部分被封装 起来，尽量不去修改它们。要想扩展新的功能，要想扩展新的功能，那就到子类中来扩展，通过子类来实现变化的部分，对这种新增的功能是开放的。
● 里氏替换：保证所有的子类实现的值同一个算法模板，并在使用模板的地方，根据需要切换不同的具体实现。

模板方法的写法：
● 模板方法：定义算法骨架的方法
● 具体的操作：在模板中直接实现的某些步骤的方法。通常这些步骤的实现算法是固定的，因此将其当做公共的功能放在模板中。如果不为子类提供访问这些方法的话，可以声明为private。如果子类需要访问这些方法，可以声明为protected final，让子类不能覆盖和修改。
● 具体的AbstractClass 操作：在模板中实现某些公共功能，可以提供给子类使用，一般不是具体的算法步骤的实现，而是一些辅助的公 共功能。
● 原语操作：就是在模板中定义的抽象操作，通常是模板方法需要调用的操作，是必须的操作，而且是在父类中还没有确定如何实现， 需要在子类中实现的方法。
● 钩子操作：在模板中定义，并提供默认实现的操作。这些方法通常被视可扩展的点，但不是必须的，子类可以选择性地覆盖这些方法，并提供新的实现来扩展功能。
● Factory Method：在模板方法中，如果需要得到某些对象的实例的话，可以考虑通过工厂方法模式来获取，把具体的构建对象的实现延迟到子类中去。
   
   
Java 回调
java 回调技术，通过回调在接口中的方法，调用到具体的实现类中的方法，其本质是利用Java的动态绑定技术。在这种实现中，可以不把实现类写成单独的类，而是使用匿名内部类来实现回调方法。
应用Java回调技术来实现模板方法模式，在实际开发中使用的也非常多，也算是模板方法的一种变形吧。
   

小结：模板方法的两种实现方式：
● 使用继承的方式，抽象方法和具体实现的关系式在编译期间静态决定的，是类级的关系；使用Java回调，这个关系是在运行期间动态决
   定的，是对象级的关系。
● 相对而言，使用回调机制会更灵活，因为Java是单继承的，而回调是基于接口的。
● 使用继承会更简单，因为父类提供了实现（钩子方法），子类不想扩展，就不用覆盖；使用回调机制，回调的接口需要把所有可能被扩
   展的方法都定义进去，这就导致实现的时候，不管你要不要扩展，都要实现这个方法，哪怕什么都不做，只要调转模板中已有的实现，
   都要写出来。


 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		LoginModel lm = new LoginModel();
		lm.setUserId("admin");
		lm.setPassword("workerpwd");

		LoginTemplate lt = new WorkerLogin();
		LoginTemplate lt2 = new NormalLogin();

		boolean flag = lt.login(lm);
		System.out.println("可以登陆工作平台=" + flag);
		boolean flag2 = lt2.login(lm);
		System.out.println("可以普通人员登陆=" + flag2);
	}
}