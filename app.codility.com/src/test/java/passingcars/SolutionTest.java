package passingcars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int[] A = new int[5];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;
        int expected = 5;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_simple() {
        int[] A = new int[6];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 0;
        A[5] = 1;
        int expected = 6;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolutionTuning_example() {
        int[] A = new int[5];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;
        int expected = 5;
        int actual = (new Solution()).solutionTuning(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolutionTuning_simple() {
        int[] A = new int[6];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 0;
        A[5] = 1;
        int expected = 6;
        int actual = (new Solution()).solutionTuning(A);
        assertEquals(expected, actual);
    }



}
