package com.max.designpatterns.Adapter;

import com.max.designpatterns.common.Bird;

/**
 * Created by maxiao on 2017/8/14.
 * <p>
 * 【这是对象的适配器模式】
 */
public class Wrapper implements Birdable
{
    private Bird bird;

    public Wrapper(Bird bird)
    {
        super();
        this.bird = bird;
    }

    @Override
    public void eat()
    {
        bird.eat();
    }

    @Override
    public void fly()
    {
        System.out.println("Bird fly");
    }
}
