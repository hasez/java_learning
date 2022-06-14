package sorting.intro;

public class Sort {
    public int[] selectionSort(int[] A) {
        for (int k = 0; k < A.length; k++) {
            int minimal = k;
            for (int j = k + 1; j < A.length; j++) {
                if (A[j] < A[minimal]) {
                    minimal = j;
                }
            }
            // swap A[k], A[minimal]
            int tmp = A[minimal];
            A[minimal] = A[k];
            A[k] = tmp;
        }
        return A;
    }
    public int[] countingSort(int[] A) {
        int min = 0;
        int max = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        int[] count = new int[max - min + 1];
        for (int i = 0; i<A.length; i++) {
            count[ A[i] - min ]++;
        }
        int p = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                A[p++] = i + min;
            }
        }
        return A;
    }
}
