package stackandqueue.nesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolutionSampleNested() {
        String S = "(()(())())";
        int expected = 1;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionSampleNotNested() {
        String S = "())";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionSampleNotNestedOpenBracketOnly() {
        String S = "(";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionSampleNotNestedCloseBracketOnly() {
        String S = ")";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }


}
