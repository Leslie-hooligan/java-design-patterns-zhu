package com.zhu.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/8/13 22:25 周日
 */
@Slf4j
@Data
public abstract class Target {

    private Size size;
    private Visibility visibility;

    public void printStatus() {
        log.info("{}, [size={}] [visibility={}]", this, getSize(), getVisibility());
    }

    public  void changeSize() {
        setSize(getSize()== Size.SMALL?Size.NORMAL:Size.SMALL);
    }
    public void changeVisibility() {
        setVisibility(getVisibility()== Visibility.VISIBLE? Visibility.INVISIBLE: Visibility.VISIBLE);
    }
}
