package com.zhu.composite;

import lombok.RequiredArgsConstructor;

/**
 * @author Zhu Junchao
 * @create 2023/8/5 16:48 周六
 */
@RequiredArgsConstructor
public class Letter extends LetterComposite{
    private final char character;

    @Override
    public void print() {
        System.out.println(character);
    }
}
