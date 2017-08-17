package com.max.designpatterns.Decorator;

/**
 * Created by maxiao on 2017/8/17.
 */
public class Client
{
    public static void main(String[] args)
    {
        Person person = new Employee();
        person = new ManagerA(person);
        person = new ManagerB(person);

        person.coding();

    }
}
