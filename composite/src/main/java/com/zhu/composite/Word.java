package com.zhu.composite;

import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/5 16:51 周六
 */
public class Word extends LetterComposite {

    public void word(List<Letter> letters) {
        letters.forEach(Letter::print);
    }

    @Override
    protected void printThisBefore() {
        System.out.println(" ");
    }

}
