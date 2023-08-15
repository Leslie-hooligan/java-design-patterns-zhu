package com.zhu.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/15 22:58 周二
 */
public class Play {

    private List<String> players = Arrays.asList("zhangsan","lisi","wangwu");

    public void accept(PlayVisitor visitor){
        players.forEach(player ->{
            visitor.eat(player);
            visitor.sleep(player);
            visitor.dadodo(player);
        });

    }
}
