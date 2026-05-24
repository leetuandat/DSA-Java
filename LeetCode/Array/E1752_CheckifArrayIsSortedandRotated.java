/**
 * The link of this problem is <a href = "https://leetcode.com/problems/check-if-array-is-sorted-and-rotated"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 24-May-26
 * @time: 10:52 PM
 * @package: LeetCode.Array
 */
 
package LeetCode.Array;

public class E1752_CheckifArrayIsSortedandRotated {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
