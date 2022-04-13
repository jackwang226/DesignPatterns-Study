package com.wanggang.studyproject.strategy.impl;

import com.wanggang.studyproject.strategy.Quack;

/**
 * 呱呱叫接口
 *
 * @author wg
 * @version 1.0.0
 * 2022/3/31 23:30
 */
public class GuaQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}