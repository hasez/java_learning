package permmissingelem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int[] A = {2, 3, 1, 5};
        Solution solution = new Solution();
        int actual = solution.solution(A);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_large_range_1() {
        int N = 100000;
        int[] A = new int[N - 1]; 
        int expected = 10001;
        for (int i = 1, j = 0; i <= N; i++) {
            if (i == expected) {
                // skip
            } else {
                A[j++] = i;
            }
        }
        Solution solution = new Solution();
        int actual = solution.solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void solutionEmpty() {
        int[] A = new int[] {};
        int expected = 1;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void solutionMissingLast() {
        int[] A = new int[] {1, 2, 3, 4};
        int expected = 5;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void solutionMissingFirst() {
        int[] A = new int[] {2, 3, 4};
        int expected = 1;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void solutionSingle() {
        int[] A = new int[] {2};
        int expected = 1;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void solutionDouble() {
        int[] A = new int[] {2, 3};
        int expected = 1;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }


}
