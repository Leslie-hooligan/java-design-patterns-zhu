package com.zhu.proxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 15:08 周日
 */
@AllArgsConstructor
public class HelloProxy implements InvocationHandler {
    private HelloInterface hello;

    public Object getInstance() {
       return Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy " + method);
        Object invoke = method.invoke(hello, args);
        return invoke;
    }
}
