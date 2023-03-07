package com.solt.render;

public class FormalRender implements RenderExpression{
    @Override
    public void display(int numb) {
        System.out.println("Number :" + numb);
    }
}
