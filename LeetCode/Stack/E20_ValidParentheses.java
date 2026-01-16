/**
 * This class is used to solve Valid Parentheses problem in leetcode.
 * The link of this problem is <a href = "https://leetcode.com/problems/valid-parentheses/"> here </a>
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 1/16/2026
 * @time: 09:49 AM
 * @package: LeetCode.Stack
 */

package LeetCode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class E20_ValidParentheses {
    //Brute Force
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    //Stack
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Stack and Map
    public boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && closeToOpen.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid4(String s) {
        int len = s.length();
        if ((len & 1) == 1) return false;
        char[] stack = new char[len];
        int top = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(': stack[top++] = ')'; break;
                case '[': stack[top++] = ']'; break;
                case '{': stack[top++] = '}'; break;
                default:
                    if (top == 0 || stack[--top] != c) return false;
            }
        }
        return top == 0;
    }
}
