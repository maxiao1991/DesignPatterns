package com.max.designpatterns.Adapter;

import com.max.designpatterns.common.Bird;

/**
 * Created by maxiao on 2017/8/14.
 */
public class Client
{
    public static void main(String[] args)
    {
        Birdable bird = new Adapter();
        bird.eat();
        bird.fly();

        Bird bird1 = new Bird();
        Birdable birdable = new Wrapper(bird1);
        birdable.eat();
        birdable.fly();

        Birdable2 birdable20 = new BirdSub1();
        Birdable2 birdable21 = new BirdSub2();

        birdable20.eat();
        birdable20.fly();
        birdable21.eat();
        birdable21.fly();
    }
}
