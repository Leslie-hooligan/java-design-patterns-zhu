package com.zhu.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        Blacksmith blacksmith = Factory.createBlacksmith(Factory.BlacksmithType.ELF);
        log.info(blacksmith.toString());
        Weapon weapon = blacksmith.makeWeapon(WeaponType.BROADSWORD);
        log.info(weapon.toString());
        Weapon weapon1 = blacksmith.makeWeapon(WeaponType.DAGGER);
        log.info(weapon1.toString());
        Weapon weapon2 = blacksmith.makeWeapon(WeaponType.ROCKET);
        log.info(weapon2.toString());

        Blacksmith blacksmith1 = Factory.createBlacksmith(Factory.BlacksmithType.ORC);
        log.info(blacksmith1.toString());
        Weapon weapon3 = blacksmith1.makeWeapon(WeaponType.BROADSWORD);
        log.info(weapon3.toString());
        Weapon weapon4 = blacksmith1.makeWeapon(WeaponType.DAGGER);
        log.info(weapon4.toString());
        Weapon weapon5 = blacksmith1.makeWeapon(WeaponType.ROCKET);
        log.info(weapon5.toString());


    }
}
