package generics;

import java.awt.*;
import java.io.File;

public class MemoryCell<T extends Comparable> implements Comparable<MemoryCell> {
    private T storedValue;

    public T read() {
        return storedValue;
    }

    public void write(T x) {
        storedValue = x;
    }

    @Override
    public int compareTo(MemoryCell o) {
        return storedValue.compareTo(o.storedValue);
    }
}





