package com.max.designpatterns.Adapter;

import com.max.designpatterns.common.Bird;

/**
 * Created by maxiao on 2017/8/14.
 * 适配器模式(Adapter Pattern) ：将一个接口转换成客户希望的另一个
 * 接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器
 * (Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构
 * 型模式。
 * <p>
 * 【这里是类的适配器模式】
 */
public class Adapter extends Bird implements Birdable
{
    @Override
    public void fly()
    {
        System.out.println("Bird fly");
    }
}
