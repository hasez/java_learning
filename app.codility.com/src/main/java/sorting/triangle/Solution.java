package sorting.triangle;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if ((long) A[i - 1] + (long) A[i - 2] > A[i]) {
                return 1;
            }
        }
        return 0;
    }
}
