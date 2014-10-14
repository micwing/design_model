package com.onekr.designmodel.memento;

public class WindowsSystem {
	private String state;

	public Memento createMemento() { // 创建系统备份
		return new Memento(state);
	}

	public void restoreMemento(Memento m) { // 恢复系统
		this.state = m.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前系统处于" + this.state);
	}

}
