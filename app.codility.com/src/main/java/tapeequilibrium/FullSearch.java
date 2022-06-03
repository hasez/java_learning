package tapeequilibrium;

import java.util.Arrays;

class FullSearch {
    public int solution(int[] A) {
        int[] differences = new int[A.length - 1];
        int pMax = A.length - 1;
        for (int P = 1; P <= pMax; P++) {
            int difference = 0;
            for (int a = 0; a < A.length; a++) {
                if (a < P) {
                    difference += A[a];
                } else {
                    difference -= A[a];
                }
            }
            differences[P - 1] = Math.abs(difference);
        }
        Arrays.sort(differences);
        return differences[0];
    }
}

