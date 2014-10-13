package com.onekr.designmodel.singleton;

/**
 * 
 * @author Administrator
 *
 */
public class Factory1 {
	
	private static Factory1 instance = new Factory1();
	
	private Factory1(){}

	public static Factory1 getInstance() {
		return instance;
	}
	
    @Override  
    protected Object clone() throws CloneNotSupportedException {  
        throw new CloneNotSupportedException();  
    }  
}
