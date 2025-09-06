// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 2
// Реализовать паттерн "Декоратор"


import Components.*;
import Decorator.*;
import Util.ColorsEnum;

public class Main
{
    public static void main(String[] args)
    {
        IDrawable circle = new Circle();
        circle.draw();

        circle = new OutlinedShape(circle, ColorsEnum.RED);
        circle = new FilledShape(circle, ColorsEnum.BLUE);
        circle.draw();

        IDrawable triangle = new OutlinedShape(new FilledShape(new Triangle(), ColorsEnum.GREEN),ColorsEnum.ORANGE);
        triangle.draw();

        IDrawable rectangle = new FilledShape(new Rectangle(), ColorsEnum.YELLOW);
        rectangle.draw();
    }
}