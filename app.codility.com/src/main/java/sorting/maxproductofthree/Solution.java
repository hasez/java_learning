package sorting.maxproductofthree;

import java.util.Arrays;

public class Solution {
    /**
     * ソートに stream を使う
     * @param A
     * @return
     */
    public int solutionByStream(int[] A) {
        int[] sorted = Arrays.stream(A).sorted().toArray();
        // positive TOP3 or negative * negative * positive
        int productTop3 = sorted[sorted.length - 1] * sorted[sorted.length - 2] * sorted[sorted.length - 3];
        int productNega = sorted[sorted.length - 1] * sorted[0] * sorted[1];
        return Math.max(productTop3, productNega);
    }

    public int solutionByArrays(int[] A) {
        Arrays.sort(A);
        int productTop3 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int productNega = A[A.length - 1] * A[0] * A[1];
        return Math.max(productTop3, productNega);
    }
}
