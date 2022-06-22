package stackandqueue.fish;

import java.util.Stack;

public class Solution {
    public int solution(int[] A, int[] B) {
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int direction = B[i];
            int[] current = {size, direction};
            while (!stack.isEmpty()) {
                int[] top = stack.pop();
                int topSize = top[0];
                int topDirection = top[1];
                // collision
                if (topDirection == 1 && direction == 0) {
                    // Finish when current is eaten
                    if (size < topSize) {
                        stack.push(top);
                        break;
                    }
                } else {
                    stack.push(top);
                    stack.push(current);
                    break;
                }
            }
            if (stack.isEmpty()) {
                stack.push(current);
            }
        }
        return stack.size();
    }

    public int solutionSubtract(int[] A, int[] B) {
        int fishCount = A.length;
        Stack<Integer> stack = new Stack<>();
        int up = 0;
        int down = 1;
        for (int i = 0; i < A.length; i++) {
            // Stack downstream fish
            if (B[i] == down) {
                stack.push(A[i]);
            }
            if (B[i] == up) {
                while (!stack.isEmpty()) {
                    fishCount--; // Either fish must be eaten.
                    // When downstream fish eat upstream fish
                    if (stack.peek() > A[i]) {
                        break;
                    }
                    // When upstream fish eat downstream fish
                    else if (stack.peek() < A[i]) {
                        stack.pop();
                    }
                }
            }
        }
        return fishCount;
    }
}
