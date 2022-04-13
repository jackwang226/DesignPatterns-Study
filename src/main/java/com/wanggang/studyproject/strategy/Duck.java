package com.wanggang.studyproject.strategy;

import lombok.Data;

/**
 *  鸭子接口,所有鸭子实现此接口
 * @author wg
 * 2022/3/31  22:41:21
 */
@Data
public abstract class Duck {

    private Fly fly;

    private Quack quack;

    void fly(){
        fly.fly();
    }

    void quack(){
        quack.quack();
    }

}
