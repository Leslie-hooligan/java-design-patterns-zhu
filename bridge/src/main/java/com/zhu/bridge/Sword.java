package com.zhu.bridge;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 19:25 周日
 */
@Slf4j
@AllArgsConstructor
public class Sword implements Weapon {
    private Enchantment enchantment;

    @Override
    public void wield() {
        log.info("wield...");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        log.info("swing...");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("unwield...");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
