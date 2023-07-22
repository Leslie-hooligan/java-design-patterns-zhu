package com.zhu.singleton;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 14:16 周六
 */
public class Singleton {
    private Singleton() {
    }

    private static final Singleton INSTANCE = new Singleton();

    public Singleton getInstance() {
        return INSTANCE;
    }
}
