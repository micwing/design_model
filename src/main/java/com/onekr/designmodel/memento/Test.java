package com.onekr.designmodel.memento;

/**
 * Memento备忘录模式

一、 模式定义:
在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可以将该对象恢复到原先保存前的状态。
二、 模式解说
在程序运行过程中，某些对象的状态处在转换过程中，可能由于某种原因需要保存此时对象的状态，以便程序运行到某个特定阶段，需要恢复到对象之前处于某个点时的状态。如果使用一些公有接口让其它对象来得到对象的状态，便会暴露对象的实现细节。
三、角色
1) 备忘录（Memento）角色：备忘录角色存储“备忘发起角色”的内部状态。“备忘发起角色”根据需要决定备忘录角色存储“备忘发起角色”的哪些内部状态。为了防止“备忘发起角色”以外的其他对象访问备忘录。备忘录实际上有两个接口，“备忘录管理者角色”只能看到备忘录提供的窄接口——对于备忘录角色中存放的属性是不可见的。“备忘发起角色”则能够看到一个宽接口——能够得到自己放入备忘录角色中属性。
2) 备忘发起（Originator）角色：“备忘发起角色”创建一个备忘录，用以记录当前时刻它的内部状态。在需要时使用备忘录恢复内部状态。
3) 备忘录管理者（Caretaker）角色：负责保存好备忘录。不能对备忘录的内容进行操作或检查。

四、一个例子
在本例中，WindowsSystem是发起人角色(Orignation),Memento是备忘录角色(Memento),User是备忘录管理角色(Caretaker)。Memento提供了两个接口（注意这里的接口,并不是java中的接口，它指的是可被外界调用的方法）：一个是为WindowsSystem 类的宽接口，能够得到WindowsSystem放入Memento的state属性，代码见WindowsSystem的createMemento方法和restoreMemento方法，createMemento方法向Memento放入state属性，restoreMemento方法获得放入的state属性。另一个是为User类提供的窄接口，只能管理Memento而不能对它的内容进行任何操作（见User类）。

五、 优缺点
1） 保持封装边界 使用备忘录可以避免暴露一些只应由原发器管理却又必须存储在原发器之外的信息。该模式把可能很复杂的Originator内部信息对其他对象屏蔽起来，从而保持了封装边界。
2） 它简化了原发器 在其他的保持封装性的设计中，Originator负责保持客户请求过的内部状态版本。这就把所有存储管理的重任交给了Originator。让客户管理它们请求的状态将会简化Originator，并且使得客户工作结束时无需通知原发器。
3） 使用备忘录可能代价很高 如果原发器在生成备忘录时必须拷贝并存储大量的信息，或者客户非常频繁地创建备忘录和恢复原发器状态，可能会导致非常大的开销。除非封装和恢复Originator状态的开销不大，否则该模式可能并不合适。
4） 维护备忘录的潜在代价 管理器负责删除它所维护的备忘录。然而，管理器不知道备忘录中有多少个状态。因此当存储备忘录时，一个本来很小的管理器，可能会产生大量的存储开销。
六、 适用性
1）必须保存一个对象在某一个时刻的（部分）状态，这样以后需要时它才能恢复到先前的状态。
2）如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
 *
 */
public class Test {
	public static void main(String[] args) {

		WindowsSystem winxp = new WindowsSystem(); // Winxp系统
		User user = new User(); // 某一用户
		winxp.setState("好的状态"); // Winxp处于好的运行状态
		user.saveMemento(winxp.createMemento()); // 用户对系统进行备份，Winxp系统要产生备份文件
		winxp.setState("坏的状态"); // Winxp处于不好的运行状态
		winxp.restoreMemento(user.retrieveMemento()); // 用户发恢复命令，系统进行恢复
		System.out.println("当前系统处于" + winxp.getState());
	}
}
