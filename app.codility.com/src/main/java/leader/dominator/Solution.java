package leader.dominator;

import java.util.Arrays;

public class Solution {
    public int solutionSort(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        int[] sortTarget = Arrays.copyOf(A, A.length);
        Arrays.sort(sortTarget);

        int dominator = sortTarget[A.length / 2];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (dominator == A[i]) {
                count++;
            }
            if (count > A.length / 2) {
                return i;
            }
        }
        return -1;
    }

    public int solutionStack(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int a : A) {
            if (stack.isEmpty() || stack.peek() == a) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        int dominator = -1;
        if (!stack.isEmpty()) {
            dominator = stack.pop();
        } else {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (dominator == A[i]) {
                count++;
            }
            if (count > A.length / 2) {
                return i;
            }
        }
        return -1;
    }

}
