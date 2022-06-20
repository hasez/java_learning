package stackandqueue.brackets;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        String S = "{[()()]}";
        int expected = 1;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested() {
        String S = "([)()]";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_simple() {
        String S = ")(";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_openonly() {
        String S = "((";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_closeonly() {
        String S = "))";
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_nested_max() {
        String S = "(".repeat(10000000) + ")".repeat(10000000);
        int expected = 1;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_openonly_max() {
        String S = "(".repeat(20000000);
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_closeonly_max() {
        String S = ")".repeat(200000000);
        int expected = 0;
        int actual = new Solution().solution(S);
        assertEquals(expected, actual);
    }


}
