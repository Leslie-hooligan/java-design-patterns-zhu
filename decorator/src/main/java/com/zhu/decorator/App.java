package com.zhu.decorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClubbedTroll clubbedTroll = new ClubbedTroll();
        clubbedTroll.attack();
        clubbedTroll.getAttackPower();
        clubbedTroll.fleeBattle();
    }
}
