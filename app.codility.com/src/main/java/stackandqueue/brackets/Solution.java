package stackandqueue.brackets;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int solution(String S) {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : S.toCharArray()) {
            Character closeBracket = null;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    deque.push(c);
                    break;
                case ')':
                    closeBracket = deque.poll();
                    if (closeBracket == null) {
                        return 0;
                    }
                    if (!closeBracket.equals('(')) {
                        return 0;
                    }
                    break;
                case '}':
                    closeBracket = deque.poll();
                    if (closeBracket == null) {
                        return 0;
                    }
                    if (!closeBracket.equals('{')) {
                        return 0;
                    }
                    break;
                case ']':
                    closeBracket = deque.poll();
                    if (closeBracket == null) {
                        return 0;
                    }
                    if (!closeBracket.equals('[')) {
                        return 0;
                    }
                    break;
                default:
                    break;
            }
        }
        return deque.size() == 0 ? 1 : 0;
    }

    public int solutionMap(String S) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPair = new HashMap<>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };

        for (Character c : S.toCharArray()) {
            if (bracketPair.containsKey(c)) {
                if (stack.isEmpty()) {
                    return 0;
                }
                // bracket pair unmatch.
                if (!bracketPair.get(c).equals(stack.pop())) {
                    return 0;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }

}
