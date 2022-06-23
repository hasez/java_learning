package stackandqueue.nesting;

class Solution {
    static int nested = 1;
    static int notNested = 0;

    public int solution(String S) {
        int counter = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
            if (counter < 0) {
                break;
            }
        }

        return counter == 0 ? nested : notNested;
    }

    public int solutionUseStack(String S) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return notNested;
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? nested : notNested;
    }



}
