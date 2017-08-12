package com.max.designpatterns.builder;

import com.max.designpatterns.common.Person;

/**
 * Created by Administrator on 2017/8/12.
 */
public class PersonDirector
{
    public Person constructPerson(PersonBuilder personBuilder)
    {
        personBuilder.buiderHead();
        personBuilder.builderBody();
        personBuilder.builderFoot();
        return personBuilder.buiderPerson();
    }
}
