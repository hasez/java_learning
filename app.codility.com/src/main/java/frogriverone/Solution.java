package frogriverone;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solutionSimple(int X, int[] A) {
        Set<Integer> position = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            position.add(A[i]);
            if (position.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
