package com.zhu.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        Hero build = new HeroBuilder().setArmor(Armor.CLOTHES).setHairType(HairType.CURLY).setHairColor(HairColor.BLOND).build();
        log.info(build.toString());
    }
}
