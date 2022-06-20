package stackandqueue.brackets;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTestMap {
    @Test
    public void testSolution_example() {
        String S = "{[()()]}";
        int expected = 1;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested() {
        String S = "([)()]";
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_simple() {
        String S = ")(";
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_openonly() {
        String S = "((";
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_closeonly() {
        String S = "))";
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_nested_max() {
        String S = "(".repeat(1000000) + ")".repeat(1000000);
        int expected = 1;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_openonly_max() {
        String S = "(".repeat(2000000);
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_example_not_nested_closeonly_max() {
        String S = ")".repeat(2000000);
        int expected = 0;
        int actual = new Solution().solutionMap(S);
        assertEquals(expected, actual);
    }
}
