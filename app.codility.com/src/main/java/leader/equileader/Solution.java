package leader.equileader;

public class Solution {
    public int solution(int[] A) {
        int[] leaderAndNumber = new Solution().searchLeaderAndNumberOfLeader(A);
        // if there is no leader, no equileader.
        if (leaderAndNumber.length == 0) {
            return 0;
        }
        int leader = leaderAndNumber[0];
        int count = leaderAndNumber[1];

        int occurrence = 0;
        int firstCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                firstCount++;
            }
            // Measure being leader in both the first and second half of the array.
            if (firstCount > (i + 1) / 2 && count - firstCount > (A.length - i - 1) / 2) {
                occurrence++;
            }
        }
        return occurrence;
    }

    /**
     * Search Leader and number of leader for Array. </br>
     * The leader of this sequence is the element whose value occurs more than n / 2 times. </br>
     * If there is no leader, return empty array.
     * 
     * @param array Array to search leader
     * @return leader and number of leader { leader, number of leader }
     */
    private int[] searchLeaderAndNumberOfLeader(int[] array) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int a : array) {
            if (stack.isEmpty() || stack.peek() == a) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        /*
         * verify leader
         */
        if (stack.isEmpty()) {
            return new int[0];
        }
        int candidate = stack.pop();
        int count = 0;
        for (int a : array) {
            if (a == candidate) {
                count++;
            }
        }
        if (count > array.length / 2) {
            int[] result = {candidate, count};
            return result;
        }
        return new int[0];
    }
}
