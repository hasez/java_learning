package stackandqueue.stonewall;

public class Solution {
    public int solution(int[] H) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int count = 0;
        for (int i = 0; i < H.length; i++) {
            while (!stack.isEmpty()) {
                int top = stack.pop();
                if (top < H[i]) {
                    stack.push(top);
                    stack.push(H[i]);
                    break;
                } else if (top > H[i]) {
                    count++;
                }
                // equal
                else {
                    stack.push(H[i]);
                    break;
                }
            }

            if (stack.isEmpty()) {
                stack.push(H[i]);
            }
        }
        return count + stack.size();
    }

}
