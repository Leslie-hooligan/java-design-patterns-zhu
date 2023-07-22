package com.zhu.factorymethod;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:46 周六
 */
public interface Blacksmith {
    Weapon makeWeapon(WeaponType weaponType);
}
