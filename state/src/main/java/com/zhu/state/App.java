package com.zhu.state;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mammoth mammoth = new Mammoth();
        mammoth.status();
        mammoth.changeState();
        mammoth.status();
    }
}
