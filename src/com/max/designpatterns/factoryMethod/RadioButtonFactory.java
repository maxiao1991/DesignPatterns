package com.max.designpatterns.factoryMethod;

import com.max.designpatterns.common.Button;
import com.max.designpatterns.common.RadioButton;

/**
 * Created by Administrator on 2017/8/12.
 */
public class RadioButtonFactory implements Factory
{
    @Override
    public Button createButton()
    {
        return new RadioButton();
    }
}
