package genomicrangequery;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution_example() {
        String S = "CAGCCTA";
        int[] P = new int[3];
        int[] Q = new int[3];
        P[0] = 2;    Q[0] = 4;
        P[1] = 5;    Q[1] = 5;
        P[2] = 0;    Q[2] = 6;
        int[] expected = { 2, 4, 1 };
        int[] actual = new Solution().solution(S, P, Q);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolutionTuneup_example() {
        String S = "CAGCCTA";
        int[] P = new int[3];
        int[] Q = new int[3];
        P[0] = 2;    Q[0] = 4;
        P[1] = 5;    Q[1] = 5;
        P[2] = 0;    Q[2] = 6;
        int[] expected = { 2, 4, 1 };
        int[] actual = new Solution().solutionTuneup(S, P, Q);
        assertArrayEquals(expected, actual);
    }

    //  ('AC', [0, 0, 1], [0, 1, 1])
    @Test
    public void testSolutionTuneup_double() {
        int[] expected = { 1, 1, 2 };
        int[] actual = new Solution().solutionTuneup(
            "AC", new int[] {0,0,1}, new int[] {0,1,1});
        assertArrayEquals(expected, actual);
    }

}
