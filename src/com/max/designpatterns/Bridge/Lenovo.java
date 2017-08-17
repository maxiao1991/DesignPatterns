package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 * <p>
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，
 * 使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体
 * (Handle and Body)模式或接口(Interface)模式。
 */
public class Lenovo extends Computer
{
    /**
     * 构造函数
     *
     * @param cpuAbility
     */
    public Lenovo(CpuAbility cpuAbility)
    {
        super(cpuAbility);
    }

    @Override
    public void checkComputerAbility()
    {
        System.out.println("Lenovo cpu --> " + super.cpuAbility.cpuAbility());
    }
}
