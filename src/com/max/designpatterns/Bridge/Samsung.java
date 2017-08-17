package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 */
public class Samsung extends Computer
{
    /**
     * 构造函数
     *
     * @param cpuAbility
     */
    public Samsung(CpuAbility cpuAbility)
    {
        super(cpuAbility);
    }

    @Override
    public void checkComputerAbility()
    {
        System.out.println("Samsung cpu --> " + super.cpuAbility.cpuAbility());
    }
}
