package sorting.numberofdiscintersections;

import java.util.Arrays;

class Solution {
    public int solution_normal(int[] A) {
        int count = 0;
        long[][] range = new long[A.length][2];
        int from = 0, to = 1;
        for (int i = 0; i < A.length; i++) {
            range[i][from] = (long) i - A[i];
            range[i][to] = (long) i + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (range[i][to] < range[j][from] || range[j][to] < range[i][from]) {
                    // out of range = not intersect
                } else {
                    count++;
                    if (count > 10000000) {
                        return -1;
                    }
                }
            }
        }
        return count;
    }

    public int solutionRangeScan(int[] A) {
        int count = 0;
        long[] startDisc = new long[A.length];
        long[] endDisc = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            startDisc[i] = (long) i - A[i];
            endDisc[i] = (long) i + A[i];
        }
        Arrays.sort(startDisc);
        Arrays.sort(endDisc);

        int active = 0;
        int startDiscIndex = 0;
        int endDiscIndex = 0;

        for (; endDiscIndex < A.length; endDiscIndex++) {
            /*
             * count of active disks (including your own) by the time the disk ends.
             */
            for (; startDiscIndex < A.length; startDiscIndex++) {
                if (startDisc[startDiscIndex] <= endDisc[endDiscIndex]) {
                    active++;
                } else {
                    break;
                }
            }
            /**
             * Exclude from the active disk as it ends up on its own.
             */
            active--;
            /*
             * Add up the active disks at that time.
             */
            count += active;
            if (count > 10000000) {
                return -1;
            }
        }
        return count;
    }
}
