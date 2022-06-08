package missinginteger;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

    private static int[] larges;
    @BeforeClass
    public static void setUp() {
        int N = 10000000;
        int bond = 1000000;
        larges = new int[N];
        for (int i = 0; i < N; i++) {
            int sign = (new Random().nextInt() % 2) == 0 ? -1 : 1;
            larges[i] = sign * new Random().nextInt(bond);
        }
    }

    @Test
    public void testSolution_example1() {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        int expected = 5;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example2() {
        int[] A = { 1, 2, 3 };
        int expected = 4;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    public void testSolution_example3() {
        int[] A = { -1, -3 };
        int expected = 1;
        int actual = (new Solution()).solution(A);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution_array_all() {
        int[] A = larges;
        (new Solution()).solution(A);
        // assertEquals(expected, actual);
    }
    @Test
    public void testSolution_set_all() {
        int[] A = larges;
        (new Solution()).solution_set(A);
        // assertEquals(expected, actual);
    }
}
