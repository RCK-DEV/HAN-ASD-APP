package sorters;

import org.junit.*;
import org.junit.rules.ExpectedException;
import sorters.InsertionSort;
import sorters.MergeSort;
import sorters.QuickSort;
import sorters.Sorter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortTest {

    private static Sorter[] sorters = new Sorter[3];

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void initSorters() {
        sorters[0] = new InsertionSort();
        sorters[1] = new MergeSort();
        sorters[2] = new QuickSort();
    }

    @Test
    public void SortersThrowsIllegalArgumentExceptionWhenInputIsNull() {
        int[] input = null;
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortThrowsIllegalArgumentExceptionWhenInputIsNull" );

            try {
                sorter.sort(input);
            } catch (IllegalArgumentException e) {
                continue;
            }

        }

    }

    @Test
    public void SortersArrangesArrayInDescendingOrderIntoAscendingOrder() {
        int[] input = {55,44,33,22,11,1};
        int[] expected = {1,11,22,33,44,55};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayInDescendingOrderIntoAscendingOrder" );
            assertThat(sorter.sort(input), is(expected));
        }
    }

    @Test
    public void SortersArrangesArrayWithMultipleValuesWithTheSameValue() {
        int[] input = {1,1,1,1,1,1,1,1,1};
        int[] expected = {1,1,1,1,1,1,1,1,1};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayWithMultipleValuesWithTheSameValue" );
            assertThat(sorter.sort(input), is(expected));
        }
    }

    @Test
    public void SortersArrangesArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder() {
        int[] input = {55,44,3,8,333,12,9};
        int[] expected = {3,8,9,12,44,55,333};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder" );
            assertThat(sorter.sort(input), is(expected));
        }
    }

}