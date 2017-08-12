package com.max.designpatterns.factoryMethod;

import com.max.designpatterns.common.Button;

/**
 * Created by maxiao on 2017/8/12.
 */
public class Client
{
    public static void main(String[] args)
    {
        Factory radioFactory = new RadioButtonFactory();
        Button radioButton = radioFactory.createButton();
        radioButton.print();

        Factory squareFactory = new SquareButtonFactory();
        Button squareButton = squareFactory.createButton();
        squareButton.print();
    }
}
