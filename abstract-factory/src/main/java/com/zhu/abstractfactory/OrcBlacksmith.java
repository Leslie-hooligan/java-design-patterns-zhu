package com.zhu.abstractfactory;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 22:52 周六
 */
public class OrcBlacksmith implements Blacksmith{
//    private static Map<WeaponType,OrcWeapon> ELFARSENAL;
//
//    static {
//        ELFARSENAL=new EnumMap<>(WeaponType.class);
//        Arrays.stream(WeaponType.values()).forEach(weapon -> ELFARSENAL.put(weapon,new OrcWeapon(weapon)));
//    }

    @Override
    public Weapon makeWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }

    @Override
    public String toString() {
        return "OrcBlacksmith";
    }
}