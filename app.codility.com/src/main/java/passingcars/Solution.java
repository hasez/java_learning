package passingcars;

class Solution {
    public int solution(int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            // traveling west car
            if (A[i] == 0) {
                for (int j = i + 1; j < A.length; j++) {
                    // passing
                    if (A[j] == 1) {
                        counter++;
                    }
                    if (counter > 1000000000) {
                        return -1;
                    }
                }
            }
        }
        return counter;
    }

    /**
     * incremental countup if east.
     * (passing) counter add incremental if west.
     * @param A
     * @return
     */
    public int solutionTuning(int[] A) {
        int counter = 0;
        int incremental = 0;
        for (int a : A) {
            // car traveling east
            if (a == 0) {
                incremental++;
            }
            // car traveling west
            if (a == 1) {
                counter += incremental;
            }
            if (counter > 1000000000) {
                return -1;
            }
        }
        return counter;
    }
}
