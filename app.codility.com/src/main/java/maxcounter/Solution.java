package maxcounter;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCount = 0;
        int minCount = 0;
        for (int op : A) {
            // Operation: increase(X)
            if (1 <= op && op <= N) {
                counters[ op - 1 ] = counters[ op - 1 ] < minCount ? minCount : counters[ op - 1 ];
                counters[ op - 1 ]++;
                // record max count
                if (maxCount < counters[ op - 1 ]) {
                    maxCount = counters[ op - 1 ];
                }
            }
            // Operation: max counter
            if (op == N + 1) {
                minCount = maxCount;
            }
        }
        fillIfLower(counters, minCount);
        return counters;
    }

    /**
     * Assigns the specified fillValue to each element that lower than fillValue 
     * the specified array of ints.
     * @param array the array to be filled
     * @param fillValue the value to be stored in each element that lower than fillValue of the array
     */
    private void fillIfLower(int[] array, int fillValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < fillValue ? fillValue : array[i];
        }
    }
}