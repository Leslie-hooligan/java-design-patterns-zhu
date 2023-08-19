package com.zhu.observer;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/19 22:35 周六
 */

public class Weather {
    private final List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(WeatherType.COLD);
        }
    }
}
