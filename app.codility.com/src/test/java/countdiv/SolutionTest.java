package countdiv;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int A = 6;
        int B = 11;
        int K = 2;
        int expected = 3;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_A_remain() {
        int A = 5;
        int B = 11;
        int K = 2;
        int expected = 3;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_B_no_remain() {
        int A = 6;
        int B = 10;
        int K = 2;
        int expected = 3;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_only_start() {
        int A = 6;
        int B = 7;
        int K = 2;
        int expected = 1;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_only_end() {
        int A = 7;
        int B = 8;
        int K = 2;
        int expected = 1;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_middle_K() {
        int A = 6;
        int B = 11;
        int K = 5;
        int expected = 1;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_large_K() {
        int A = 6;
        int B = 11;
        int K = 12;
        int expected = 0;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_extream() {
        int A = 0;
        int B = 2000000000;
        int K = 1;
        int expected = 2000000001;
        int actual = (new Solution()).solution(A, B, K);
        assertEquals(expected, actual);
    }

}
