package com.max.designpatterns.builder;

import com.max.designpatterns.common.Man;
import com.max.designpatterns.common.Person;

/**
 * Person对象的构造器
 * Created by Administrator on 2017/8/12.
 */
public class ManBuilder implements PersonBuilder
{
    Person person;

    public ManBuilder()
    {
        person = new Man();
    }

    @Override
    public void buiderHead()
    {
        person.setHead("建造男人的头部");
    }

    @Override
    public void builderBody()
    {
        person.setBody("建造男人的身体");
    }

    @Override
    public void builderFoot()
    {
        person.setFoot("建造男人的脚部");
    }

    @Override
    public Person buiderPerson()
    {
        return person;
    }
}
