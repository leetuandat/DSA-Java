/**
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

    /**
     * Loại bỏ dần các cặp ngoặc hợp lệ
     * Ý tưởng: liên tục tìm và xóa các cặp ngoặc đúng "()"; "[]"; "{}"
     *          cho đến khi không còn cặp nào đề xóa
     *          nếu chuỗi rỗng -> hợp lệ, còn ký tự -> không hợp lệ
     * Độ phức tạp O(n^2)
     */

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }

    //Stack - Lưu ngoặc mở, kiểm tra ngoặc đóng
    /**
     * Ý tưởng:
     *       - Gặp ngoặc mở '(', '[', '{' -> push vào stack
     *       - Gặp ngoặc đóng ')', '], '}' -> pop ra kiểm tra có khớp không
     *       - Cuối cùng stack phải rỗng
     * Độ phức tạp: O(n)
     */
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}') && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Stack and Map
    /**
     * Ý tưởng:
     *      - Dùng map để ánh xạ: ngoặc đóng -> ngoặc mở tương ứng
     *      - Gặp ngoặc đóng -> kiểm tra với peek của stack
     *      - Gặp ngoặc mở -> push vào stack
     */
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

    /**
     * Array thay Stack + Switch case
     * Ý tưởng:
     *      - Dùng mảng char[] thay Stack để giảm overhead
     *      - Gặp ngoặc mở -> lưu ngoặc đóng tương ứng vào array
     *      - Gặp ngoặc đóng -> so sánh với phần tử pop (giảm top xuống)
     *      - Kiểm tra độ dài lẻ ngày từ đầu để tối ưu
     */
    public boolean isValid4(String s) {
        int len = s.length();
        if ((len & 1) == 1) return false;
        int top = 0;
        char[] stack = new char[len];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(': stack[top++] = ')'; break;
                case '[': stack[top++] = ']'; break;
                case '{': stack[top++] = '}'; break;
                default: if (top == 0 || stack[--top] != c) return false;
            }
        }
        return top == 0;
    }
}
