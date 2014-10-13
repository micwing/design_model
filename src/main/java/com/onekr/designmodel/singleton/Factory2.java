package com.onekr.designmodel.singleton;

public class Factory2 implements Cloneable {
	
	private static Factory2 instance = null;
	
	private Factory2(){}

	public static Factory2 getInstance() {
		if (instance == null) {
			//如果在网络编程中，要注意多线程访问singleton
			synchronized (Factory2.class) {  
                if (instance == null) {  
                	instance = new Factory2();  
                }  
            }
		}
		return instance;
	}
	
    @Override  
    protected Object clone() throws CloneNotSupportedException {  
        throw new CloneNotSupportedException();  
    }
}
