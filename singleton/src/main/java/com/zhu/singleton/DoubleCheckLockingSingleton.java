package com.zhu.singleton;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 14:33 周六
 */
public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException();
        }
    }

    public static DoubleCheckLockingSingleton getInstance() {
        DoubleCheckLockingSingleton instance = INSTANCE;
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                instance=INSTANCE;
                if(instance == null){
                    INSTANCE=instance=new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
