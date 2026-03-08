import java.util.*;

// @leet imports end
// @leet start
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char opening = stack.pop();
            if ((current == ')' && opening != '(')
                || (current == ']' && opening != '[')
                || (current == '}' && opening != '{')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
// @leet end
