package com.zhu.templatemethod;

import lombok.AllArgsConstructor;

/**
 * @author Zhu Junchao
 * @create 2023/8/6 22:23 周日
 */
@AllArgsConstructor
public class HalflingThief {
    private StealingMethod method;

    public void steal(){
        method.steal();
    }

    public void changeMethod(StealingMethod method){
        this.method=method;
    }
}
