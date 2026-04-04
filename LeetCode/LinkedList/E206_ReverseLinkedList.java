/**
 * The link of this problem is <a href = "https://leetcode.com/problems/reverse-linked-list"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/24/2026
 * @time: 11:24 PM
 * @package: LeetCode.LinkedList
 */

package LeetCode.LinkedList;

public class E206_ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Declare 1 array has same size with ListNode
     * Add node to array then reverse array
     * Create new ListNode then add node from array
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public ListNode reverseList(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int[] arr = new int[size];
        curr = head;
        for (int i = 0; i < size; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }
        int left = 0;
        int right = size-1;
        while (right > left) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        if (size == 0) return null;
        ListNode dummy = new ListNode(arr[0]);
        curr = dummy;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return dummy;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
