package com.zhu.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:46 周六
 */
public class ElfBlacksmith implements Blacksmith{
//    private static Map<WeaponType,ElfWeapon> ELFARSENAL;
//
//    static {
//        ELFARSENAL=new EnumMap<>(WeaponType.class);
//        Arrays.stream(WeaponType.values()).forEach(weapon -> ELFARSENAL.put(weapon,new ElfWeapon(weapon)));
//    }

    @Override
    public Weapon makeWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
