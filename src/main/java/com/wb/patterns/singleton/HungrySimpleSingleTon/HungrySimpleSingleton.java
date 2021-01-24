package com.wb.patterns.singleton.HungrySimpleSingleTon;

/**
 * 恶汉式，初始化时已经创建单例对象
 * 绝对纯种安全
 *
 */
public class HungrySimpleSingleton {
    public HungrySimpleSingleton() {
    }

    private static HungrySimpleSingleton hungrySimpleSingleton;

    static {
        hungrySimpleSingleton = new HungrySimpleSingleton();
    }


    public static HungrySimpleSingleton getInstance() {
        return hungrySimpleSingleton;
    }
}
