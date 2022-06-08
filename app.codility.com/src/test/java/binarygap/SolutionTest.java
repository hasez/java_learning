package binarygap;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution9() {
        BinaryGap binaryGap = new Solution();
        int input = 9;
        int actual = binaryGap.solution(input);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution15() {
        BinaryGap binaryGap = new Solution();
        int input = 15;
        int actual = binaryGap.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution20() {
        BinaryGap binaryGap = new Solution();
        int input = 20;
        int actual = binaryGap.solution(input);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution32() {
        BinaryGap binaryGap = new Solution();
        int input = 32;
        int actual = binaryGap.solution(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution529() {
        BinaryGap binaryGap = new Solution();
        int input = 529;
        int actual = binaryGap.solution(input);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution1041() {
        BinaryGap binaryGap = new Solution();
        int input = 1041;
        int actual = binaryGap.solution(input);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionAny() {
        BinaryGap binaryGap = new Solution();
        for (int i = 0; i < 5000; i++) {
            long start = System.currentTimeMillis();
            binaryGap.solution(i);
            long end = System.currentTimeMillis();
            System.out.println(i + ":" + (end - start));
        }
    }

}
