package com.zhu.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:34 周六
 */
@Getter
@AllArgsConstructor
public class ElfWeapon implements Weapon{
    private  WeaponType weaponType;


}
