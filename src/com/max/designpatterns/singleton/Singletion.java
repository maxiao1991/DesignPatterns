package com.max.designpatterns.singleton;

/**
 * Created by Administrator on 2017/8/12.
 *
 *  单例模式(Singleton Pattern)：单例模式确保某一个类只有一个实例，
 *  而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提
 *  供全局访问的方法。
 *  单例模式的要点有三个：一是某个类只能有一个实例；二是它必须自行
 *  创建这个实例；三是它必须自行向整个系统提供这个实例。单例模式是
 *  一种对象创建型模式。单例模式又名单件模式或单态模式。
 */
public class Singletion
{
    private volatile static Singletion singletion;

    /**
     * 定义私有构造函数
     */
    private Singletion()
    {
    }

    public static Singletion getInstance()
    {
        if (null == singletion)
        {
            synchronized (Singletion.class)
            {
                if (null == singletion)
                {
                    singletion = new Singletion();
                }
            }
        }
        return singletion;
    }

    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void print()
    {
        System.out.println("the name is " + name);
    }
}
