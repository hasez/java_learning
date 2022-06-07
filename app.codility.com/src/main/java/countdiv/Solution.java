package countdiv;

public class Solution {
    public int solution(int A, int B, int K) {
        int divA = A / K;
        int remainA = A % K;
        int min = K * (divA + (remainA > 0 ? 1 : 0));

        int divB = B / K;
        int max = K * divB;

        int margin = max - min;
        int count = 1 + margin / K;
        return count;
    }
}
