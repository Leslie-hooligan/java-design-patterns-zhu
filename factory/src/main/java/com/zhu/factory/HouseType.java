package com.zhu.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Supplier;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 19:44 周六
 */
@Getter
@AllArgsConstructor
public enum HouseType {
    IS_SOHO(SOHO::new),
    IS_TANGCHEN(Tangchen::new);

    private Supplier<House> constructor;
}
