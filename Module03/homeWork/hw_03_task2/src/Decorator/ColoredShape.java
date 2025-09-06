package Decorator;

import Components.IDrawable;
import Util.ColorsEnum;

public class ColoredShape extends DrawDecorator
{
    ColorsEnum color;

    public ColoredShape(IDrawable shapeToDecorate)
    {
        this(shapeToDecorate, ColorsEnum.AUTO);
    }

    public ColoredShape(IDrawable shapeToDecorate, ColorsEnum color)
    {
        super(shapeToDecorate);
        this.color = color;
    }

    public void setColor(ColorsEnum color) {this.color = color;}
}
