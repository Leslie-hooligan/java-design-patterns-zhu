package com.zhu.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:45 周六
 */
@Getter
@AllArgsConstructor
public class OrcWeapon implements Weapon{
    private WeaponType weaponType;
}
