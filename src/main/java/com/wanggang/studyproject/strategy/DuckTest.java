package com.wanggang.studyproject.strategy;

import com.wanggang.studyproject.strategy.impl.*;

/**
 * 类描述
 *
 * @author wg
 * @version 1.0.0
 * 2022/3/31 23:31
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck whiteDuck = new WhiteDuck();
        Duck redDuck = new RedDuck();

        whiteDuck.setFly(new SkyFly());
        whiteDuck.setQuack(new CantQuack());

        redDuck.setFly(new CantFly());
        redDuck.setQuack(new GuaQuack());

        whiteDuck.fly();
        whiteDuck.quack();

        redDuck.fly();
        redDuck.quack();
    }
}