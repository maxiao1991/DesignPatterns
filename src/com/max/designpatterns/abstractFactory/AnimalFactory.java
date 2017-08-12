package com.max.designpatterns.abstractFactory;

import com.max.designpatterns.common.Animal;

/**
 * Created by maxiao on 2017/8/12.
 * <p>
 * 抽象工厂模式(Abstract Factory Pattern)：提供一个创建
 * 一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 * 抽象工厂模式又称为Kit模式，属于对象创建型模式。
 */
public interface AnimalFactory
{
    Animal createBird();

    Animal createFish();
}
