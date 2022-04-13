package com.wanggang.studyproject.strategy.impl;

import com.wanggang.studyproject.strategy.Fly;

/**
 * 不会飞实现类
 *
 * @author wg
 * @version 1.0.0
 * 2022/3/31 23:27
 */
public class CantFly implements Fly {
    @Override
    public void fly() {
        System.out.println("我根本不会飞");
    }
}