package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 */
public abstract class Computer
{
    CpuAbility cpuAbility;

    /**
     * 构造函数
     *
     * @param cpuAbility
     */
    public Computer(CpuAbility cpuAbility)
    {
        this.cpuAbility = cpuAbility;
    }

    public abstract void checkComputerAbility();
}
