package sorters;

public class QuickSort extends Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input == null) throw new IllegalArgumentException(NULL_INPUT_EXCEPTION);

        quickSort(input, 0, input.length - 1);
        return input;
    }

    @Override
    public String getName() {
        return "sorters.QuickSort";
    }

    public void quickSort(int[] array, int low, int high) {

        if (low >= high)
            return;

        // Selecting the  pivot
        int first = low;
        int second = low < high ? low + 1 : high;
        int third = low + 1 < high ? low + 2 : high;
        // Median for first three
        int pivot = Math.max(Math.min(array[first],array[second]),
                Math.min(Math.max(array[first],array[second]),array[third]));

        while (low <= high)
        {
            while (array[low] < pivot)
            {
                low++;
            }

            while (array[high] > pivot)
            {
                high--;
            }

            if (low <= high)
            {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }

        // Sorting recursively
        if (low < high)
            quickSort(array, low, high);

        if (high > low)
            quickSort(array, low, high);
    }


}
