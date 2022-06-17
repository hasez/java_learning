package sorting.numberofdiscintersections;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int A[] = {1, 5, 2, 1, 4, 0};
        int expected = 11;
        int actual = new Solution().solution_normal(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_simple() {
        int A[] = {1, 1, 1};
        int expected = 3;
        int actual = new Solution().solution_normal(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionRangeScan_example() {
        int A[] = {1, 5, 2, 1, 4, 0};
        int expected = 11;
        int actual = new Solution().solutionRangeScan(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionRangeScan_simple() {
        int A[] = {1, 1, 1};
        int expected = 3;
        int actual = new Solution().solutionRangeScan(A);
        assertEquals(expected, actual);
    }


}
