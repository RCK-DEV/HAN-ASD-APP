package sorters;

import java.util.Arrays;
import java.util.List;

public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public T[] sort(T[] input) {
        if (input == null) throw new IllegalArgumentException(NULL_INPUT_EXCEPTION);

        quickSort(input, 0, input.length - 1);

        return input;
    }

    @Override
    public String getName() {
        return "sorters.QuickSort";
    }

    public void quickSort(T[] input, int low, int high) {
        if (input == null || input.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        T pivot = input[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (input[i].compareTo(pivot) < 0) {
                i++;
            }

            while (input[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                T temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(input, low, j);
        if (high > i) quickSort(input, i, high);
    }


}
