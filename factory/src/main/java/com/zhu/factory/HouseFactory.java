package com.zhu.factory;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 19:48 周六
 */
public class HouseFactory {

    public static House getHouse(HouseType type) {
        return type.getConstructor().get();
    }
}
