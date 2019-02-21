package sorters;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends Sorter<T> {

        public T[] sort(T[] input) {
        if (input == null) throw new IllegalArgumentException(NULL_INPUT_EXCEPTION);

        mergeSort(input);

        return input;
    }

    @Override
    public String getName() {
        return "sorters.MergeSort";
    }

    public void mergeSort(T[] input) {
        if (input.length <= 1){
            return;
        } else {
            T[] leftHalf = Arrays.copyOfRange(input, 0, input.length / 2);
            T[] rightHalf = Arrays.copyOfRange(input, input.length / 2, input.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            int leftIndex = 0;
            int rightIndex = 0;

            for (int i = 0; i < input.length; i++) {
                if ( rightIndex >= rightHalf.length || leftIndex < leftHalf.length && leftHalf[leftIndex].compareTo(rightHalf[rightIndex]) < 0) {
                    input[i] = leftHalf[leftIndex];
                    leftIndex++;
                } else {
                    input[i] = rightHalf[rightIndex];
                    rightIndex++;
                }
            }
        }

    }

}
