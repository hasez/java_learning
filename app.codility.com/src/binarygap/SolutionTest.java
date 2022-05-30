package binarygap;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution1041() {
        BinaryGap bynaryGap = new Solution();
        int input = 1041;
        int actual = bynaryGap.solution(input);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution32() {
        BinaryGap bynaryGap = new Solution();
        int input = 32;
        int actual = bynaryGap.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
