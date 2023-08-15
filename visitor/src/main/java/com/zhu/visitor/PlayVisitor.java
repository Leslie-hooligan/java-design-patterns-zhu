package com.zhu.visitor;

/**
 * @author Zhu Junchao
 * @create 2023/8/15 23:05 周二
 */
public abstract class PlayVisitor {

   abstract void eat(String player);
   abstract void sleep(String player);
   abstract void dadodo(String player);
}
