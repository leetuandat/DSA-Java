/**
 * This class is used to solve Valid Parentheses problem in leetcode.
 * The link of this problem is <a href = "https://leetcode.com/problems/implement-queue-using-stacks/"> here </a>
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 1/25/2026
 * @time: 05:32 PM
 * @package: LeetCode.Stack
 */

package LeetCode.Stack;

import java.util.Stack;

public class E232_ImpQueueUsingStacks {
    class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int res = stack1.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return res;
        }

        public int peek() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int res = stack1.peek();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return res;
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
