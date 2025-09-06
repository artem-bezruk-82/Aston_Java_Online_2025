package Decorator;

import Components.IDrawable;
import Util.ColorsEnum;

public class FilledShape extends ColoredShape
{
    public FilledShape(IDrawable shapeToDecorate)
    {
        this(shapeToDecorate, ColorsEnum.AUTO);
    }

    public FilledShape(IDrawable shapeToDecorate, ColorsEnum color)
    {
        super(shapeToDecorate, color);
    }

    @Override
    public void draw()
    {
        shapeToDecorate.draw();
        drawFill();
    }

    private void drawFill()
    {
        System.out.println(String.format("\t- with %s fill", color));
    }
}
