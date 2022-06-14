package sorting.intro;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class SortTest {
    private int[] A = {5, 2, 8, 14, 1, -1, 0, 0, -15, 16};
    private int[] expected = {-15, -1, 0, 0, 1, 2, 5, 8, 14, 16};

    @Before
    public void beforeEach() {
    }

    @Test
    public void testSelectionSort() {
        int[] actual = new Sort().selectionSort(A);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testCountingSort() {
        int[] actual = new Sort().countingSort(A);
        assertArrayEquals(expected, actual);
    }
}
