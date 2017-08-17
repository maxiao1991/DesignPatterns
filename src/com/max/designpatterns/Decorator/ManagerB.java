package com.max.designpatterns.Decorator;

/**
 * Created by maxiao on 2017/8/17.
 */
public class ManagerB extends Manager
{
    private Person person;

    public ManagerB(Person person)
    {
        super();
        this.person = person;
    }

    @Override
    public void coding()
    {
        person.coding();
        doLastThing();
    }

    private void doLastThing()
    {
        System.out.println("ManagerB testing...");
    }
}
