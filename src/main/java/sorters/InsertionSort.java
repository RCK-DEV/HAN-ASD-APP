package sorters;

public class InsertionSort extends Sorter {

    @Override
    public int[] sort(int[] input) {
        if (input == null) throw new IllegalArgumentException(NULL_INPUT_EXCEPTION);

        insertionSort(input);

        return input;
    }

    @Override
    public String getName() {
        return "sorters.InsertionSort";
    }

    private void insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
    }


}
