import app.RandomNumbersGenerator;
import app.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTests {

    private Integer[] arr;

    @BeforeEach
    public void setUp() {
        RandomNumbersGenerator generator = new RandomNumbersGenerator(70);
        arr = generator.getArrayAsArray();
    }

    @Test
    public void radixSort() {
        Sorter.radixSort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1], "Array should be sorted");
        }
    }

    @Test
    void testHeapSortBasic() {
        int[] arr = {5, 3, 8, 4, 2};
        Sorter.heapSort(arr);

        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr,
                "Array should be sorted in ascending order");
    }

    @Test
    void testHeapSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        Sorter.heapSort(arr);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr,
                "Already sorted array should remain unchanged");
    }

    @Test
    void testHeapSortReverseOrder() {
        int[] arr = {9, 7, 5, 3, 1};
        Sorter.heapSort(arr);

        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, arr,
                "Reverse ordered array should be sorted correctly");
    }

    @Test
    void testHeapSortWithDuplicates() {
        int[] arr = {4, 1, 3, 4, 2, 1};
        Sorter.heapSort(arr);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, arr,
                "HeapSort should correctly handle duplicate values");
    }

    @Test
    void testHeapSortSingleElement() {
        int[] arr = {42};
        Sorter.heapSort(arr);

        assertArrayEquals(new int[]{42}, arr,
                "Single element array should remain unchanged");
    }

    @Test
    void testHeapSortEmptyArray() {
        int[] arr = {};
        Sorter.heapSort(arr);

        assertEquals(0, arr.length,
                "Empty array should remain empty");
    }

    @Test
    void testHeapPropertyAfterHeapifyRoot() {
        int[] arr = {3, 9, 2, 1, 4, 5};

        // heapify only the root
        Sorter.heapify(arr, arr.length, 0);

        // root should be the largest element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            assertTrue(max >= arr[i],
                    "After heapify, root should be >= all children");
        }
    }
}
