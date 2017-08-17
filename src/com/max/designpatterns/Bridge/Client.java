package com.max.designpatterns.Bridge;

/**
 * Created by maxiao on 2017/8/17.
 */
public class Client
{
    public static void main(String[] args)
    {
        CpuAbility ability = new IntelCpu();
        Computer computer = new Lenovo(ability);
        computer.checkComputerAbility();

        CpuAbility ability1 = new AmdCpu();
        Computer computer1 = new Samsung(ability1);
        computer1.checkComputerAbility();
    }
}
