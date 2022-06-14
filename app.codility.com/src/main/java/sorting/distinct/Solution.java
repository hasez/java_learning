package sorting.distinct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (set.contains(a)) {
                continue;
            }
            set.add(a);
        }
        return set.size();
    }
    /**
     * Using Arrays.stream
     * @param A
     * @return
     */
    public int solutionByStream(int[] A) {
        return (int) Arrays.stream(A).distinct().count();
    }
}