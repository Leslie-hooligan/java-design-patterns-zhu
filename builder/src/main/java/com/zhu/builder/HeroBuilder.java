package com.zhu.builder;

import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 15:38 周日
 */
@Setter
@Accessors(chain = true)
public class HeroBuilder {
    private Armor armor;
    private HairColor hairColor;
    private HairType hairType;


 public Hero build(){
     Hero hero = new Hero();
     hero.setArmor(armor);
     hero.setHairColor(hairColor);
     hero.setHairType(hairType);
     return hero;
 }



}
