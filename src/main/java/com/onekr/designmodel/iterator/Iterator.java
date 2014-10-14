package com.onekr.designmodel.iterator;

/**
 * 定义迭代接口，或者使用java.util.Iterator接口
 * 
 * @author Administrator
 * 
 * @param <T>
 */
public interface Iterator<T> {
	public T first();

	public T next();

	public boolean isDone();

	public T currentItem();

	public T add(T t);
}