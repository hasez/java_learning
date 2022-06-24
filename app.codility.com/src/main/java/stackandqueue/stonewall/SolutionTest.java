package stackandqueue.stonewall;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution() {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int expected = 7;
        int actual = new Solution().solution(H);
        assertEquals(expected, actual);
    }
}
