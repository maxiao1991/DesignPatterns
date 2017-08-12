package com.max.designpatterns.factoryMethod;

import com.max.designpatterns.common.Button;

/**
 * Created by maxiao on 2017/8/12.
 *
 * 工厂方法模式(Factory Method Pattern)又称为工厂模式，也
 * 叫虚拟构造器(Virtual Constructor)模式或者多态工厂(Poly-
 * morphic Factory)模式，它属于类创建型模式。在工厂方法模式中
 * ，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生
 * 成具体的产品对象，这样做的目的是将产品类的实例化操作延迟到工
 * 厂子类中完成，即通过工厂子类来确定究竟应该实例化哪一个具体产
 * 品类。
 *
 */
public interface Factory
{
    public Button createButton();
}
