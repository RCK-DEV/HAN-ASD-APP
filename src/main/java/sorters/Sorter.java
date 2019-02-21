package sorters;

import generics.MemoryCell;

import java.util.List;

public abstract class Sorter<T extends Comparable<T>> {
    protected static final String NULL_INPUT_EXCEPTION = "Null input exception";
    public abstract T[] sort(T[] input);
    public abstract String getName();
}