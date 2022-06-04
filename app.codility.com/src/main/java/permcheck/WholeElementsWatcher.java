package permcheck;

import java.util.SortedSet;
import java.util.TreeSet;

class WholeElementsWatcher {
    /**
     * Condition of Permutation.
     *  - Set size equals Array length. 
     *  - Set last element value equals Array length.
     * 
     * @param A
     * @return
     */
    public int solution(int[] A) {
        SortedSet<Integer> distinctable = new TreeSet<>();
        for (int a : A) {
            distinctable.add(a);
        }
        if (distinctable.size() != A.length) {
            return ReturnCode.IS_NOT_PERMUTATION.intValue();
        }
        if (distinctable.last() != A.length) {
            return ReturnCode.IS_NOT_PERMUTATION.intValue();
        }
        return ReturnCode.IS_PERMUTATION.intValue();
    }
}
