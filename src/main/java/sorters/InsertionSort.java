package sorters;

public class InsertionSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public T[] sort(T[] input) {
        if (input == null) throw new IllegalArgumentException(NULL_INPUT_EXCEPTION);

        insertionSort(input);

        return input;
    }

    @Override
    public String getName() {
        return "sorters.InsertionSort";
    }

    private void insertionSort(T[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j].compareTo(input[j- 1]) < 0) {
                    T temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
    }


}
