package com.onekr.designmodel.composite;

import java.util.Iterator;

//部件-抽象类
public abstract class Graph {
	// 画图
	public abstract void draw();

	// 增加一个图形
	public void add(Graph g) {
	};

	// 删除一个图形组件
	public void remove(Graph g) {
	};

	// 获得组合体的内部部件
	public Iterator<Graph> iter() {
		return null;
	};
}
