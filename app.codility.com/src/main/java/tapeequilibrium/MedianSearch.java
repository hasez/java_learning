package tapeequilibrium;

class MedianSearch {
    public int solution(int[] A) {
        int position = A.length / 2;
        int first = 0;
        int second = 0;
        for (int i = 0; i < A.length; i++) {
            if (i < position) {
                first += A[i];
            } else {
                second += A[i];
            }
        }
        int different = Math.abs(first - second);

        while (first != second && (position > 1 || position < A.length -1)) {
            int currentDifferent = 0;
            if (first < second) {
                first += A[position];
                second -= A[position];
                position++;
            } else {
                first -= A[position - 1];
                second += A[position - 1];
                position--;
            }
            currentDifferent = Math.abs(first - second);
            if (currentDifferent < different) {
                different = currentDifferent;
            } else {
                break;
            }
        }
        return different;
    }
}

