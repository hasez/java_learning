package sorting.triangle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example_exists() {
        int[] A = { 10, 2, 5, 1, 8, 20 };
        int expected = 1;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_not_exists() {
        int[] A = { 10, 50, 5, 1 };
        int expected = 0;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_overflow_max() {
        int[] A = { Integer.MAX_VALUE -2 , Integer.MAX_VALUE - 1, Integer.MAX_VALUE };
        int expected = 1;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_overflow_min() {
        int[] A = { Integer.MIN_VALUE, Integer.MIN_VALUE + 1 , Integer.MIN_VALUE + 2 };
        int expected = 0;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
}
