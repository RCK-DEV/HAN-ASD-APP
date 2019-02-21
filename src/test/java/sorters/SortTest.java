package sorters;

import generics.MemoryCell;
import org.junit.*;
import org.junit.rules.ExpectedException;

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
        Comparable[] input = null;
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
        Integer[] input = {55,44,33,22,11,1};
        Integer[] expected = {1,11,22,33,44,55};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayInDescendingOrderIntoAscendingOrder" );

            assertThat(sorter.sort(input), is(expected));
        }
    }

    @Test
    public void SortersArrangesArrayWithMultipleValuesWithTheSameValue() {
        Integer[] input = {1,1,1,1,1,1,1,1,1};
        Integer[] expected = {1,1,1,1,1,1,1,1,1};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayWithMultipleValuesWithTheSameValue" );
            assertThat(sorter.sort(input), is(expected));
        }
    }

    @Test
    public void SortersArrangesArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder() {
        Integer[] input = {55,44,3,8,333,12,9};
        Integer[] expected = {3,8,9,12,44,55,333};
        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": mergeSortSortsArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder" );
            assertThat(sorter.sort(input), is(expected));
        }
    }

    @Test
    public void SortersArrangesMemoryCellArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder() {

        MemoryCell<String> a = new MemoryCell<>();
        a.write("A");
        MemoryCell<String> b = new MemoryCell<>();
        b.write("B");
        MemoryCell<String> c = new MemoryCell<>();
        c.write("C");


        MemoryCell[] input = new MemoryCell[3];
        input[0] = b;
        input[1] = a;
        input[2] = c;

        MemoryCell[] expected = new MemoryCell[3];
        expected[0] = a;
        expected[1] = b;
        expected[2] = c;

        for (Sorter sorter : sorters) {
            System.out.println(sorter.getName() + ": SortersArrangesMemoryCellArrayWithMultipleUnorderedRandomValuesIntoAscendingOrder" );
            assertThat(sorter.sort(input), is(expected));
        }
    }
}