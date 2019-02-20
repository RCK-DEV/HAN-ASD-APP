package sorters;

public abstract class Sorter {
    protected static final String NULL_INPUT_EXCEPTION = "Null input exception";
    public abstract int[] sort(int[] input);
    public abstract String getName();
}