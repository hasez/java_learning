package permmissingelem;

public class Solution {
    public int solution(int[] A) {
        int sumOfMissing = 0;
        for (int a : A) {
            sumOfMissing += a;
        }
        int N = A.length;
        // Sum of array of no missing element
        // (MIN + MAX) * ArraySize / 2
        // long sumOfNoMissing = ((1 + N + 1) * (N + 1)) / 2;
        int sumOfNoMissing = 0;
        for (int i = 1; i <= N + 1; i++) {
            sumOfNoMissing += i;
        }

        return sumOfNoMissing - sumOfMissing;
    }
}
