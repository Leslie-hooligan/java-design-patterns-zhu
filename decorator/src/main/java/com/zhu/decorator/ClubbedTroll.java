package com.zhu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 22:54 周日
 */
@Slf4j
public class ClubbedTroll implements Troll {
    private SimpleTroll simpleTroll = new SimpleTroll();

    @Override
    public void attack() {
        log.info("ClubbedTroll attack... ");
        simpleTroll.attack();
    }

    @Override
    public int getAttackPower() {
        log.info("ClubbedTroll AttackPower");

        return simpleTroll.getAttackPower();
    }

    @Override
    public void fleeBattle() {
        log.info("ClubbedTroll fleeBattle");
        simpleTroll.fleeBattle();
    }
}
