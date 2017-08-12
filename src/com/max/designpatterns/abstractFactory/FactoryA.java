package com.max.designpatterns.abstractFactory;

import com.max.designpatterns.common.Animal;
import com.max.designpatterns.common.Bird;
import com.max.designpatterns.common.Fish;

/**
 * Created by maxiao on 2017/8/12.
 */
public class FactoryA implements AnimalFactory
{
    @Override
    public Animal createBird()
    {
        return new Bird();
    }

    @Override
    public Animal createFish()
    {
        return new Fish();
    }
}
