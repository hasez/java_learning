package cyclicrotation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_3_8_9_7_6_shift_3() {
        int[] a = {3, 8, 9, 7, 6};
        int k = 3;
        CyclicRotation target = new Solution();
        int[] actual = target.solution(a, k);
        int[] expected  = {9, 7, 6, 3, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution_0_0_0_shift_1() {
        int[] a = {0, 0, 0};
        int k = 1;
        CyclicRotation target = new Solution();
        int[] actual = target.solution(a, k);
        int[] expected  = {0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution_3_8_9_7_6_shift_1() {
        int[] a = {3, 8, 9, 7, 6};
        int k = 1;
        CyclicRotation target = new Solution();
        int[] actual = target.solution(a, k);
        int[] expected  = {6, 3, 8, 9, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution_empty_shift_1() {
        int[] a = {};
        int k = 1;
        CyclicRotation target = new Solution();
        int[] actual = target.solution(a, k);
        int[] expected  = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution_empty_shift_0() {
        int[] a = {};
        int k = 0;
        CyclicRotation target = new Solution();
        int[] actual = target.solution(a, k);
        int[] expected  = {};
        assertArrayEquals(expected, actual);
    }
}
