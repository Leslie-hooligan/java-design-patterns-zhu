package com.zhu.proxy;

import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 15:24 周日
 */
@AllArgsConstructor
public class HelloCglibProxy implements MethodInterceptor {
    private HelloInterface helloInterface;

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(helloInterface.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("HelloCglibProxy...");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);

        return invokeSuper;
    }
}
