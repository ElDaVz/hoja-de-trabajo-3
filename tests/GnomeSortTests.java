import app.RandomNumbersGenerator;
import app.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GnomeSortTests {

    private Integer[] arr;

    @BeforeEach
    public void setUp() {
        RandomNumbersGenerator generator = new RandomNumbersGenerator(70);
        arr = generator.getArrayAsArray();
    }

    @Test
    public void gnomeSort() {
        Sorter.gnomeSort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1], "Array should be sorted");
        }
    }
}