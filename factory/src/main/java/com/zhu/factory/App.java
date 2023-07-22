package com.zhu.factory;

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
        House house = HouseFactory.getHouse(HouseType.IS_SOHO);
        House house1 = HouseFactory.getHouse(HouseType.IS_TANGCHEN);
        log.info(house.description());
        log.info(house1.description());
    }
}
