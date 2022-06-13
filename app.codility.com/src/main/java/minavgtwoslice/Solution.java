package minavgtwoslice;

public class Solution {
    public int solution(int[] A) {
        int minPosition = Integer.MAX_VALUE;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int sum2 = A[i] + A[i + 1];
            double avg2 = sum2 / 2.0;
            double avg3 = Double.MAX_VALUE;
            if (i < A.length - 2) {
                avg3 = (sum2 + A[i + 2]) / 3.0;
            }
            double currentMinAvg = Math.min(avg2, avg3);

            if (currentMinAvg < minAvg) {
                minPosition = i;
                minAvg = currentMinAvg;
            }
        }
        return minPosition;
    }
}
