package generics;

import java.awt.*;

public class Rectangle extends Shape {
    protected int x, y, width, height;
    public void draw(Canvas c) {
        System.out.println("Rectangle drawn");
    }
}
