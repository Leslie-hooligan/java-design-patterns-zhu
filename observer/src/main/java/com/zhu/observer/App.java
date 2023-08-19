package com.zhu.observer;

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
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.notifyObservers();
        weather.notifyObservers();
        weather.notifyObservers();
        weather.notifyObservers();

        // Generic observer inspired by Java Generics and Collections by Naftalin & Wadler
        log.info("--Running generic version--");
    }
}
