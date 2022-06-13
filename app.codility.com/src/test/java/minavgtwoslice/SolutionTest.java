package minavgtwoslice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int[] A = {4,2,2,5,1,5,8};
        int expected = 1;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_simple2() {
        int[] A = {-3, -5, -8, -4, -10};
        int expected = 2;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }


}
