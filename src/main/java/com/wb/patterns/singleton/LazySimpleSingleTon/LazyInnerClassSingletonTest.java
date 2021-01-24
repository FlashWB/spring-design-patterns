package com.wb.patterns.singleton.LazySimpleSingleTon;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            // 通过反射获取私有构造 方法
            Constructor c = clazz.getDeclaredConstructor(null);
            // 强制访问
            c.setAccessible(true);
            // 暴力初始化
            Object o1 = c.newInstance();

//            Object o2 = c.newInstance();
//            System.out.println(o1==o2);
            // 输出false，显然创建了2个不同的实例
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
