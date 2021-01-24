package com.wb.patterns.singleton.LazySimpleSingleTon;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lzy = null;

    public LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lzy==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lzy==null){
                    lzy = new LazyDoubleCheckSingleton();
                    // 1.分配内在给这个对象
                    // 2.初始化对象
                    // 3.设置azy指向刚分配的内存地址
                }
            }
        }
        return lzy;
    }
}
