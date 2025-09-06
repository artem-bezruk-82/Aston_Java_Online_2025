package Decorator;

import Components.IDrawable;
import Components.Shape;

public abstract class DrawDecorator implements IDrawable
{
    IDrawable shapeToDecorate;

    public DrawDecorator(IDrawable shapeToDecorate)
    {
        this.shapeToDecorate = shapeToDecorate;
    }

    @Override
    public void draw() {shapeToDecorate.draw();}
}
