package frogjmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int x = 10;
        int y = 85;
        int d = 30;
        int expected = 3;
        Solution target = new Solution();
        int actual = target.solution(x, y, d);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_min() {
        int x = 1;
        int y = 1;
        int d = 1;
        int expected = 0;
        Solution target = new Solution();
        int actual = target.solution(x, y, d);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_max() {
        int x = 1000000000;
        int y = 1000000000;
        int d = 1000000000;
        int expected = 0;
        Solution target = new Solution();
        int actual = target.solution(x, y, d);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_min_to_max() {
        int x = 1;
        int y = 1000000000;
        int d = 1000000000;
        int expected = 1;
        Solution target = new Solution();
        int actual = target.solution(x, y, d);
        assertEquals(expected, actual);
    }
}
