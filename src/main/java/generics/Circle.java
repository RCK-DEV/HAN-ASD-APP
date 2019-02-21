package generics;

import java.awt.*;

public class Circle extends Shape {
    private int x, y, radius;
    public void draw(Canvas c) {
        System.out.println("Circle drawn");
    }
}