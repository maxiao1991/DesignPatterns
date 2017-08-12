package com.max.designpatterns.simpleMethod;

import com.max.designpatterns.common.Button;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Client
{
    public static void main(String[] args)
    {
        SimpleFactory factoryMethod = new SimpleFactory();

        Button radioButton = factoryMethod.createButton("radio");
        radioButton.print();

        Button squareButton = factoryMethod.createButton("square");
        squareButton.print();
    }
}
