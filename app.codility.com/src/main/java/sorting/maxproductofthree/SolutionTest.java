package sorting.maxproductofthree;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolutionByStream_example() {
        int[] A = {-3, 1, 2, -2, 5, 6};
        int expected = 60;
        int actual = new Solution().solutionByStream(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionByStream_negative_x_negative() {
        int[] A = {-5, 5, -5, 4};
        int expected = 125;
        int actual = new Solution().solutionByStream(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionByStream_all_negative() {
        int[] A = {-5, -5, -5, -1};
        int expected = -25;
        int actual = new Solution().solutionByStream(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionByArrays_example() {
        int[] A = {-3, 1, 2, -2, 5, 6};
        int expected = 60;
        int actual = new Solution().solutionByArrays(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionByArrays_negative_x_negative() {
        int[] A = {-5, 5, -5, 4};
        int expected = 125;
        int actual = new Solution().solutionByArrays(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionByArrays_all_negative() {
        int[] A = {-5, -5, -5, -1};
        int expected = -25;
        int actual = new Solution().solutionByArrays(A);
        assertEquals(expected, actual);
    }

}
