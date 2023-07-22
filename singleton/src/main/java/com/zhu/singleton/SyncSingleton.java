package com.zhu.singleton;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 14:27 周六
 */
public class SyncSingleton {
    private static volatile SyncSingleton INSTANCE;

    private SyncSingleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized SyncSingleton getInstance() {
        if (INSTANCE == null) {
             INSTANCE=new SyncSingleton();
        }
        return INSTANCE;
    }
}
