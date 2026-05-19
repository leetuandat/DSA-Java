/**
 * The link of this problem is <a href = "https://leetcode.com/problems/check-if-array-is-good"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 14-May-26
 * @time: 03:28 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;

public class E2784_CheckifArrayisGood {
    /**
     * Sorting
     * Time Complexity: O(nlogn)
     */
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return nums[len - 1] == len - 1;
    }

    /**
     * Counting
     * Time Complexity: O(n)
     */
    public boolean isGood2(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        for (int num : nums) {
            if (num >= len) return false;
            count[num]++;
        }
        for (int i = 1; i < len - 1; i++) {
            if (count[i] != 1) return false;
        }
        return count[len - 1] == 2;
    }
}
