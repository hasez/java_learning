package permcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WholeElementsWatcherTest {
    @Test
    public void testSolution_sample_permutation() {
        int[] A = new int[4];
        A[0] = 4;
        A[1] = 1;
        A[2] = 3;
        A[3] = 2;
        int expected = 1;
        int actual = (new WholeElementsWatcher()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_sample_not_permutation() {
        int[] A = new int[3];
        A[0] = 4;
        A[1] = 1;
        A[2] = 3;
        int expected = 0;
        int actual = (new WholeElementsWatcher()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_not_permutation_not_twice() {
        int[] A = new int[4];
        A[0] = 3;
        A[1] = 1;
        A[2] = 3;
        A[3] = 2;
        int expected = 0;
        int actual = (new WholeElementsWatcher()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_permutation_large() {
        int[] A = new int[100000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        int expected = 1;
        int actual = (new WholeElementsWatcher()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_not_permutation_large() {
        int[] A = new int[100000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        A[0] = 100000;
        A[100000 - 1] = 2; 
        A[100000 - 2] = A[100000 - 2] - 1; 
        int expected = 0;
        int actual = (new WholeElementsWatcher()).solution(A);
        assertEquals(expected, actual);
    }



}
