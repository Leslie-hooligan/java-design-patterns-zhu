package com.zhu.proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloInterface hello = new Hello();
        HelloProxy helloProxy = new HelloProxy(hello);
        HelloInterface instance = (HelloInterface)helloProxy.getInstance();
        instance.sayHello();


        HelloCglibProxy helloCglibProxy = new HelloCglibProxy(hello);
        HelloInterface instance1 = (HelloInterface)helloCglibProxy.getInstance();
        instance1.sayHello();
    }
}
