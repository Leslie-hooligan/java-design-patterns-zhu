package com.zhu.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:29 周六
 */
@AllArgsConstructor
@Getter
public enum WeaponType {
    DAGGER("dagger"),
    BROADSWORD("broadsword"),
    ROCKET("rocket");

    private final String name;
}
