package com.zhu.proxy;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 15:08 周日
 */
public class Hello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
