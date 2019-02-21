package generics;

import java.util.ArrayList;

public class MemoryCellTest {
    public static void main(String[] args) {
        MemoryCell<Integer> m = new MemoryCell();
        m.write(55); // Autoboxing primitive int to Integer
    }
}
