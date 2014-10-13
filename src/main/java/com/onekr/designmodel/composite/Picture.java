package com.onekr.designmodel.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//部件-图
public class Picture extends Graph {
	// 图形组建集合
	private List<Graph> graphs = new ArrayList<Graph>(10);

	// 绘制图片
	public void draw() {
		for (Graph graph : graphs) {
			graph.draw();
		}
	}

	// 增加一个图形
	public void add(Graph g) {
		graphs.add(g);
	}

	// 删除一个图形组件
	public void remove(Graph g) {
		graphs.remove(g);
	}

	// 获得图形组件
	public Iterator<Graph> iter() {
		return graphs.iterator();
	}
}
