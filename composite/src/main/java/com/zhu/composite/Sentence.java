package com.zhu.composite;

import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/5 16:58 周六
 */
public class Sentence extends LetterComposite{

    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.println(".\n");
    }
}
