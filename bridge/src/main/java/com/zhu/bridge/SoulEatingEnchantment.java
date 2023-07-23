package com.zhu.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 19:24 周日
 */
@Slf4j
public class SoulEatingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
       log.info("SoulEating started");
    }

    @Override
    public void apply() {
        log.info("SoulEating....");
    }

    @Override
    public void onDeactivate() {
        log.info("SoulEating ended");
    }
}
