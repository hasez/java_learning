package leader.equileader;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolutionSample() {
        int[] A = {4, 3, 4, 4, 4, 2};
        int expected = 2;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionSample2() {
        int[] A = {4, 3, 4, 4, 4, 2, 4};
        int expected = 4;
        int actual = new Solution().solution(A);
        assertEquals(expected, actual);
    }

}
