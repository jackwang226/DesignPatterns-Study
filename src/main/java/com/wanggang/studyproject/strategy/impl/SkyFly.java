package com.wanggang.studyproject.strategy.impl;

import com.wanggang.studyproject.strategy.Fly;

/**
 * 天空飞
 *
 * @author wg
 * @version 1.0.0
 * 2022/3/31 23:27
 */
public class SkyFly implements Fly {
    @Override
    public void fly() {
        System.out.println("我在天空飞");
    }
}