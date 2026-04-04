/**
 * The link of this problem is <a href = "https://leetcode.com/problems/merge-two-sorted-lists/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 15-Mar-26
 * @time: 04:12 PM
 * @package: LeetCode.LinkedList
 */

package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E21_MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) return list1;
        if (list1 == null) return list2;
        List<Integer> values = new ArrayList<>();
        ListNode curr = list1;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        values.sort(Integer::compareTo);
        curr = list2;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(values);
        ListNode dummy = new ListNode(values.get(0));
        curr = dummy;
        for (int i = 1; i < values.size(); i++) {
            curr.next = new ListNode(values.get(i));
            curr = curr.next;
        }
        return dummy;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        return dummy.next;
    }
}
