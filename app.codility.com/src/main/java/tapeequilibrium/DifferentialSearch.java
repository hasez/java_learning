package tapeequilibrium;

class DifferentialSearch {
    public int solution(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        int difference = Integer.MAX_VALUE;
        int first = 0;
        int second = sum;
        for (int i = 0; i < A.length - 1; i++) {
            first += A[i];
            second -= A[i];
            int currentDifference = Math.abs(first - second);
            difference = Math.min(difference, currentDifference);
        }
        return difference;
    }
}
