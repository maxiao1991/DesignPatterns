package com.max.designpatterns.singleton;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Client
{
    public static void main(String[] args)
    {
        Singletion s1 = Singletion.getInstance();
        s1.setName("max");
        Singletion s2 = Singletion.getInstance();
        s2.setName("Sissi");

        s1.print();
        s2.print();

        if (s1 == s2)
        {
            System.out.println("创建的是同一实例");
        }
        else
        {
            System.out.println("创建的不是同一实例");
        }
    }
}
