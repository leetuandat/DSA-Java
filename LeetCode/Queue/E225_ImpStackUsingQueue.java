/**
 * The link of this problem is <a href = "https://leetcode.com/problems/implement-stack-using-queues/description/"> here </a>
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 1/27/2026
 * @time: 08:59 PM
 * @package: LeetCode.Queue
 */

package LeetCode.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class E225_ImpStackUsingQueue {
    static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue1.add(x);
        }

        public int pop() {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int pop = queue1.poll();
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            return pop;
        }

        public int top() {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int top = queue1.peek();
            queue2.add(queue1.poll());
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            return top;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
