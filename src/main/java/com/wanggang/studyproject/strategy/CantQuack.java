package com.wanggang.studyproject.strategy;

/**
 * 不会叫实现类
 *
 * @author wg
 * @version 1.0.0
 * 2022/3/31 23:29
 */
public class CantQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("我不会叫啊");
    }
}