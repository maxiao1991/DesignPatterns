package com.max.designpatterns.Decorator;

/**
 * Created by maxiao on 2017/8/17.
 */
public class ManagerA extends Manager
{
    private Person person;

    public ManagerA(Person person)
    {
        super();
        this.person = person;
    }

    @Override
    public void coding()
    {
        doEarlyThing();
        person.coding();
    }

    /**
     * 项目经理做设计
     */
    private void doEarlyThing()
    {
        System.out.println("ManagerA designing...");
    }
}
