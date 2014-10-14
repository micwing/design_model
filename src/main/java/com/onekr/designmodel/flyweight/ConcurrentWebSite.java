package com.onekr.designmodel.flyweight;

/**
 * 这里我们共享的实例就是WebSite，type为内部参数，User作为外部参数传入。
 * 
 * @author Administrator
 *
 */
public class ConcurrentWebSite extends WebSite {
    public ConcurrentWebSite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println("The web site's type is: " + type);
        System.out.println("User: " + user.getUserName());
        System.out.println("Passwd: " + user.getPassWd());
        System.out.println();
    }
}