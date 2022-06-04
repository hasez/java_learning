package permcheck;

import java.util.HashSet;
import java.util.Set;

class BadElementNotifier {
    /**
     * Scanning Array from beggining.
     * Notify non-permutation When encounter bad element.
     * At ...
     * - Same value count twice.
     * - Value is bigger than array length.
     * @param A
     * @return
     */
    public int solution(int[] A) {
        Set<Integer> distinctable = new HashSet<>();
        for (int a : A) {
            if (distinctable.contains(a)) {
                return ReturnCode.IS_NOT_PERMUTATION.intValue();
            }
            if (a > A.length) {
                return ReturnCode.IS_NOT_PERMUTATION.intValue();
            }
            distinctable.add(a);
        }
        return ReturnCode.IS_PERMUTATION.intValue();
    }

}
