package com.zhu.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    private static final String MANUFACTURED = "{} manufactured {}";
    public static void main( String[] args )
    {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.makeWeapon(WeaponType.DAGGER);
        log.info(MANUFACTURED, blacksmith, weapon);
        Weapon weapon1 = blacksmith.makeWeapon(WeaponType.DAGGER);
        log.info(MANUFACTURED, blacksmith, weapon1);
        weapon = blacksmith.makeWeapon(WeaponType.BROADSWORD);
        log.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.makeWeapon(WeaponType.DAGGER);
        log.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.makeWeapon(WeaponType.BROADSWORD);
        log.info(MANUFACTURED, blacksmith, weapon);
    }
}
