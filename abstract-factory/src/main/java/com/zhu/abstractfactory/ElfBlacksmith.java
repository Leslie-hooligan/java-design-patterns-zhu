package com.zhu.abstractfactory;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:46 周六
 */
public class ElfBlacksmith implements Blacksmith {
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

    @Override
    public String toString() {
        return "ElfBlacksmith";
    }
}
