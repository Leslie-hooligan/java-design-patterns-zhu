package com.zhu.templatemethod;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 22:21 周日
 */
public class SubtleMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Warning..");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Warning..");
    }
}
