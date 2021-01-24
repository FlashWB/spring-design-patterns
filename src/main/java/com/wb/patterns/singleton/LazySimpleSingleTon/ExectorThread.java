package com.wb.patterns.singleton.LazySimpleSingleTon;

/**
 *
 * @ClassName 线程类
 * @Author Wangbo
 * @Date 2020/9/14 23:11
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+simpleSingleton);
    }
}
