package com.zhu.bridge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Weapon sword = new Sword(new FlyingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();
        Weapon hammer = new Hammer(new SoulEatingEnchantment());
        hammer.unwield();
        hammer.swing();
        hammer.unwield();
    }
}
