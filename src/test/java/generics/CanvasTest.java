package generics;

import java.util.ArrayList;
import java.util.List;

public class CanvasTest {
    public static void main(String[] args) {
        List<Rectangle> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        Canvas canvas = new Canvas();
        canvas.drawAll(shapes);
    }
}
