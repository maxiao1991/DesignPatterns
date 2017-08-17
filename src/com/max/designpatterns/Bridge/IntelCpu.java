package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 */
public class IntelCpu implements CpuAbility
{
    @Override
    public String cpuAbility()
    {
        return "Intel Cpu : 性能较好";
    }
}
