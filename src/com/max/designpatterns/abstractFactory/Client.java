package com.max.designpatterns.abstractFactory;

import com.max.designpatterns.common.Animal;

/**
 * Created by maxiao on 2017/8/12.
 */
public class Client
{
    public static void main(String[] args)
    {
        AnimalFactory factory = new FactoryA();
        Animal bird = factory.createBird();
        Animal fish = factory.createFish();
        bird.eat();
        fish.eat();
    }
}
