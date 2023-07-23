package com.zhu.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 19:21 周日
 */
@Slf4j
public class FlyingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        log.info("Flying started");
    }

    @Override
    public void apply() {
        log.info("Flying...");
    }

    @Override
    public void onDeactivate() {
        log.info("Flying ended");
    }
}
