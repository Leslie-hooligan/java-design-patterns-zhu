package com.zhu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 22:52 周日
 */
@Slf4j
public class SimpleTroll  implements Troll{
    @Override
    public void attack() {
        log.info("simpleTroll attack...");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("simpleTroll fleeBattle...");
    }
}
