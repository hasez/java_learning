package stackandqueue.fish;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int expected = 2;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_one_direction_upstream() {
        int[] A = {4, 3};
        int[] B = {0, 0};
        int expected = 2;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_one_direction_downstream() {
        int[] A = {4, 3, 2};
        int[] B = {1, 1, 1};
        int expected = 3;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_simple_down_eat() {
        int[] A = {4, 3};
        int[] B = {1, 0};
        int expected = 1;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_simple_up_eat() {
        int[] A = {3, 4};
        int[] B = {1, 0};
        int expected = 1;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_simple() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 1, 0};
        int expected = 2;
        int actual = new Solution().solution(A, B);
        assertEquals(expected, actual);
    }



}
