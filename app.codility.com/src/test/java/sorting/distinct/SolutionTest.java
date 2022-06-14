package sorting.distinct;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution() {
        int[] A = {2, 1, 1, 2, 3, 1};
        int expected = 3;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }
}
