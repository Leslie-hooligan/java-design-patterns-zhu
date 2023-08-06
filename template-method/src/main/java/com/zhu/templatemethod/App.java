package com.zhu.templatemethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HalflingThief halflingThief = new HalflingThief(new SubtleMethod());
        halflingThief.steal();
        halflingThief.changeMethod(new HitAndRunMethod());
        halflingThief.steal();
    }
}
