package tapeequilibrium;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class FullSearchTest {
    @Test
    public void testSolution_example() {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;
        int expected = 1;
        int actual = (new FullSearch()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example2() {
        int[] A = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        int expected = 3;
        int actual = (new FullSearch()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_100() {
        int[] A = new int[100];
        Arrays.fill(A, 1);
        int expected = 0;
        int actual = (new FullSearch()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_1000() {
        int[] A = new int[1000];
        Arrays.fill(A, 1);
        int expected = 0;
        int actual = (new FullSearch()).solution(A);
        assertEquals(expected, actual);
    }

}
