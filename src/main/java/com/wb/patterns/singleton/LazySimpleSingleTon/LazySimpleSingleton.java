package com.wb.patterns.singleton.LazySimpleSingleTon;

public class LazySimpleSingleton {
    public LazySimpleSingleton() {
    }
    private static LazySimpleSingleton lazy = null;
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
