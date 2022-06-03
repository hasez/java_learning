package tapeequilibrium;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class MedianSearchTest {
    @Test
    public void testSolution_example() {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;
        int expected = 1;
        int actual = (new MedianSearch()).solution(A);
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
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example3() {
        int[] A = new int[6];
        A[0] = 10;
        A[1] = 2;
        A[2] = 2;
        A[3] = 0;
        A[4] = 2;
        A[5] = 2;
        int expected = 2;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_negative() {
        int[] A = new int[] {-10, -20, -30, -40, 100};
        int expected = 20;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }


    @Test
    public void testSolution_double() {
        int[] A = new int[2];
        A[0] = 1;
        A[1] = 2;
        int expected = 1;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_double2() {
        int[] A = new int[2];
        A[0] = 1;
        A[1] = -1;
        int expected = 2;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_100() {
        int[] A = new int[100];
        Arrays.fill(A, 1);
        int expected = 0;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example_1000() {
        int[] A = new int[1000];
        Arrays.fill(A, 1);
        int expected = 0;
        int actual = (new MedianSearch()).solution(A);
        assertEquals(expected, actual);
    }


}
