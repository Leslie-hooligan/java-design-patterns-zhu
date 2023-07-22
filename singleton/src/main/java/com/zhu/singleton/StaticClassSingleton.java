package com.zhu.singleton;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 14:40 周六
 */
public class StaticClassSingleton {

    private StaticClassSingleton() {
    }

    public static StaticClassSingleton getInstance() {
        return HelperHolder.INSTANCE;
    }


    private static class HelperHolder {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }
}
