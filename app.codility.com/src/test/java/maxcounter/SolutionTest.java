package maxcounter;

import static org.junit.Assert.assertArrayEquals;
import java.util.Random;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int N = 5;
        int[] A = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;
        int[] expected = { 3, 2, 2, 4, 2 };
        int[] actual = (new Solution()).solution(N, A);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testSolution_large_random2() {
        int N = 10000;
        int operationCount = 5000000;
        int[] A = new int[operationCount];
        for (int i = 0; i < A.length; i++) {
            A[i] = new Random().nextInt(N) + 1;
            if (i % 5 == 0) {
                A[i] = N + 1;
            }
        }
        (new Solution()).solution(N, A);
    }



}