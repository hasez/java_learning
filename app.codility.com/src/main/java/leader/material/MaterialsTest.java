package leader.material;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaterialsTest {
    @Test
    public void searchLeaderSlowExample() {
        int[] A = {6, 8, 4, 6, 8, 6, 6};
        int expected = 6;
        int actual = new Materials().searchLeaderSlow(A);
        assertEquals(expected, actual);
    }

    @Test
    public void searchLeaderFastExample() {
        int[] A = {6, 8, 4, 6, 8, 6, 6};
        int expected = 6;
        int actual = new Materials().searchLeaderFast(A);
        assertEquals(expected, actual);
    }

    @Test
    public void searchLeaderSlowExampleNoLeader() {
        int[] A = {6, 8, 4, 1, 8, 1, 6};
        int expected = -1;
        int actual = new Materials().searchLeaderSlow(A);
        assertEquals(expected, actual);
    }

    @Test
    public void searchLeaderFastExampleNoLeader() {
        int[] A = {6, 8, 4, 1, 8, 1, 6};
        int expected = -1;
        int actual = new Materials().searchLeaderFast(A);
        assertEquals(expected, actual);
    }

    @Test
    public void searchLeaderFastestExample() {
        int[] A = {6, 8, 4, 6, 8, 6, 6};
        int expected = 6;
        int actual = new Materials().searchLeaderFastest(A);
        assertEquals(expected, actual);
    }

    @Test
    public void searchLeaderFastestExampleNoLeader() {
        int[] A = {6, 8, 4, 1, 8, 1, 6};
        int expected = -1;
        int actual = new Materials().searchLeaderFastest(A);
        assertEquals(expected, actual);
    }

}
