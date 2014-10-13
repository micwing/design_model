package com.onekr.designmodel.adapter;

/**
 * 适配器角色:扩展源角色，实现目标角色，从而使得目标角色改动时候，不用改动源角色，只要改动适配器
 * AAdapter使用了类的适配器模式
 * 
 * @author Administrator
 * 
 */
public class AAdapter extends Adaptee implements Target {
	public int get110v() {
		return 110;
	}
}
