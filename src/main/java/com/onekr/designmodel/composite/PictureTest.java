package com.onekr.designmodel.composite;

import java.util.Iterator;

/**
 * 
 * 

 Composite组合模式
 将对象以树形结构组织起来,以达成“部分－整体” 的层次结构，使得客户端对单个对象和组合对象的使用具有一致性。
 
 优点: 1.使客户端调用简单，客户端可以一致的使用组合结构或其中单个对象，用户就不必关系自己处理的是单个对象还是整个组合结构，这就简化了客户端代码。
     2.更容易在组合体内加入对象部件. 客户端不必因为加入了新的对象部件而更改代码。
 
 

 * @author Administrator
 *
 */
public class PictureTest {
	public static void main(String[] args) {

		// 1 准备画图
		Graph picture = new Picture();
		// 1.1 图片中需要有圆
		picture.add(new Circle());
		// 1.2 图片中需要有线
		picture.add(new Line());
		// 1.3 图片中需要有方
		picture.add(new Rectangle());
		
		//1.4图片中有个子图片
		Graph subPicture = new Picture();
		picture.add(subPicture);
		
		//1.4.1子图片中有个圆
		subPicture.add(new Circle());
		//1.4.2子图片中又有个圆
		subPicture.add(new Circle());
		
		// 画图
		picture.draw();

		// 获得组合体内的部件
		System.out.println("--------");
		Iterator<Graph> iterator = picture.iter();
		while (iterator.hasNext()) {
			iterator.next().draw();
		}
	}
}
