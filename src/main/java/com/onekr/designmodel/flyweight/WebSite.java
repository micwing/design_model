package com.onekr.designmodel.flyweight;

public abstract class WebSite {
    protected String type;
    
    public WebSite(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public abstract void use(User user);
}
