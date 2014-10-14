package com.onekr.designmodel.iterator;

import java.util.List;

/**
 * 实现迭代接口
 * 
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class ArrayIterator<T> implements Iterator<T> { 
    private List<T> list ; 
     
    private int index = 0 ;  
     
    public ArrayIterator(List<T> list){ 
        this.list = list ;  
        index = 0 ;  
    } 
     
    @Override 
    public T currentItem() { 
        return null; 
    } 
 
    @Override 
    public T first() { 
        index = 0 ;  
        return list.get( 0 ) ;  
    } 
 
    @Override 
    public boolean isDone() { 
        return list.size() > index ;  
    } 
     
    @Override 
    public T next() { 
        return list.get( index++ ) ;    
    } 
 
    @Override 
    public T add(T t) { 
        list.add( t ) ;  
        return t ; 
    } 
} 