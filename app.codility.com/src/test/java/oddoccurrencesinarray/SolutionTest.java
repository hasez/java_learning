package oddoccurrencesinarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_1() {
        int[] A = new int[7];
        A[0] = 9;
        A[1] = 3;
        A[2] = 9;
        A[3] = 3;
        A[4] = 9;
        A[5] = 7;
        A[6] = 9;
        int expected = 7;
        Solution target = new Solution();
        int actual = target.solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_single() {
        int[] A = new int[1];
        A[0] = 9;
        int expected = 9;
        Solution target = new Solution();
        int actual = target.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_not_remain() {
        int[] A = new int[2];
        A[0] = 9;
        A[1] = 9;
        int expected = Solution.ReturnCode.NOT_REMAIN.intValue();
        Solution target = new Solution();
        int actual = target.solution(A);
        assertEquals(expected, actual);
    }


}
