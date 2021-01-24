package com.wb.patterns.singleton.LazySimpleSingleTon;

public class LazyInnerClassSingleton {

    public LazyInnerClassSingleton() {
        if(LazyHolder.lzy !=null){
            // 防止创建相同实例，防止反射
            throw new RuntimeException("不能创建多个实例");
        }
    }
    // static使单例的空间共享，保证这个方法不会被重写、重载
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lzy;
    }
    // 静态内部类,内部类一点在方法调用之前初始化
    // 默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lzy = new LazyInnerClassSingleton();
    }

}
