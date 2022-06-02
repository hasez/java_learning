package permmissingelem;

public class Solution {
    public int solution(int[] A) {
        long sumOfMissing = 0;
        for (int a : A) {
            sumOfMissing += a;
        }
        int N = A.length;
        // Sum of array of no missing element
        // (MIN + MAX) * ArraySize / 2
        long sumOfNoMissing = (1 + N + 1) * (N + 1) / 2;

        return (int) (sumOfNoMissing - sumOfMissing);
    }
}
