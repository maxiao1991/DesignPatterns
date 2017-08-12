package com.max.designpatterns.simpleMethod;

import com.max.designpatterns.common.Button;
import com.max.designpatterns.common.RadioButton;
import com.max.designpatterns.common.SquareButton;

/**
 * Created by maxiao on 2017/8/12.
 *
 * 简单工厂模式(Simple Factory Pattern)：又称为静态工厂
 * 方法(Static Factory Method)模式，它属于类创建型模式。
 * 在简单工厂模式中，可以根据参数的不同返回不同类的实例。简
 * 单工厂模式专门定义一个类来负责创建其他类的实例，被创建的
 * 实例通常都具有共同的父类。
 */

public class SimpleFactory
{
    public Button createButton(String type)
    {
        if ("radio".equals(type))
        {
            return new RadioButton();
        }
        else if ("square".equals(type))
        {
            return new SquareButton();
        }
        else
        {
            System.out.println("无法生产！");
            return null;
        }
    }
}
