package com.max.designpatterns.builder;

import com.max.designpatterns.common.Person;

/**
 * Created by Administrator on 2017/8/12.
 * Person对象的构造接口
 */
public interface PersonBuilder
{
    void buiderHead();

    void builderBody();

    void builderFoot();

    Person buiderPerson();
}
