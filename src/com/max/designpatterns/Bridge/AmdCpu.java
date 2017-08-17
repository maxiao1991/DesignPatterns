package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 */
public class AmdCpu implements CpuAbility
{
    @Override
    public String cpuAbility()
    {
        return "Amd Cpu : 性能一般";
    }
}
