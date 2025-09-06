package Decorator;

import Components.IDrawable;
import Util.ColorsEnum;

public class OutlinedShape extends ColoredShape
{
    public OutlinedShape(IDrawable shapeToDecorate)
    {
        this(shapeToDecorate, ColorsEnum.AUTO);
    }

    public OutlinedShape(IDrawable shapeToDecorate, ColorsEnum color)
    {
        super(shapeToDecorate, color);
    }

    @Override
    public void draw()
    {
        shapeToDecorate.draw();
        drawBorder();
    }

    private void drawBorder()
    {
        System.out.println(String.format("\t- with %s outline", color));
    }
}
