package com.zhu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/5 16:41 周六
 */
public abstract class LetterComposite {
    private final List<LetterComposite> letters = new ArrayList<>();

    public void add(LetterComposite letterComposite) {
        letters.add(letterComposite);
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print(){
        printThisAfter();
        letters.forEach(LetterComposite::print);
        printThisBefore();
    }
}
