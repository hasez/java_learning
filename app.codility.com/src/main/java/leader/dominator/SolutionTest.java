package leader.dominator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int exppected = 7;
        int actual = new Solution().solutionSort(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolution_minrange() {
        int[] A = {};
        int exppected = -1;
        int actual = new Solution().solutionSort(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolution_no_dominator() {
        int[] A = {0, 1};
        int exppected = -1;
        int actual = new Solution().solutionSort(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolutionSortOneNumber() {
        int[] A = {1};
        int exppected = 0;
        int actual = new Solution().solutionSort(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolutionStackExample() {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int exppected = 7;
        int actual = new Solution().solutionStack(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolutionStackMinRange() {
        int[] A = {};
        int exppected = -1;
        int actual = new Solution().solutionStack(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolutionStackNoDominator() {
        int[] A = {0, 1};
        int exppected = -1;
        int actual = new Solution().solutionStack(A);
        assertEquals(exppected, actual);
    }

    @Test
    public void testSolutionStackOneNumber() {
        int[] A = {1};
        int exppected = 0;
        int actual = new Solution().solutionStack(A);
        assertEquals(exppected, actual);
    }

}
