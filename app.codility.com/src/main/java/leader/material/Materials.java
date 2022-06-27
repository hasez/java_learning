package leader.material;

public class Materials {

    private static final int NO_LEADER = -1;

    /*
     * Search Leader for Array. The leader of this sequence is the element whose value occurs more
     * than n / 2 times. This algorithm order is O(n^2).
     */
    public int searchLeaderSlow(int[] A) {
        for (int candidate : A) {
            int count = 0;
            for (int a : A) {
                if (a == candidate) {
                    count++;
                }
                if (count > A.length / 2) {
                    return candidate;
                }
            }
        }
        return NO_LEADER;
    }

    /*
     * Search Leader for Array. </br> The leader of this sequence is the element whose value occurs
     * more than n / 2 times. </br> This algorithm order is O(n log n).
     */
    public int searchLeaderFast(int[] A) {
        java.util.Arrays.sort(A);
        int candidate = A[A.length / 2];
        int count = 0;
        for (int a : A) {
            if (a == candidate) {
                count++;
            }
            if (count > A.length / 2) {
                return candidate;
            }
        }
        return NO_LEADER;
    }

    /*
     * Search Leader for Array. </br> The leader of this sequence is the element whose value occurs
     * more than n / 2 times. </br> This algorithm order is O(n).
     */
    public int searchLeaderFastest(int[] A) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int a : A) {
            if (stack.isEmpty() || stack.peek() == a) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        int candidate = -1;
        if (!stack.isEmpty()) {
            candidate = stack.pop();
        } else {
            return NO_LEADER;
        }
        int count = 0;
        for (int a : A) {
            if (a == candidate) {
                count++;
            }
            if (count > A.length / 2) {
                return candidate;
            }
        }
        return NO_LEADER;
    }


}
