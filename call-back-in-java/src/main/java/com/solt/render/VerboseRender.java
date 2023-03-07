package com.solt.render;

public class VerboseRender implements RenderExpression{

    @Override
    public void display(int numb) {
        System.out.println(
                String.format("number=[%s]",numb)
        );
    }
}
