package com.zhu.templatemethod;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 22:19 周日
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal(){
        String target = pickTarget();
        System.out.println("stealing..");
        confuseTarget(target);
        stealTheItem(target);
    }
}
