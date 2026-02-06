/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-removals-to-balance-array/"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/6/2026
 * @time: 09:22 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;

public class M3634_MinimunRemovalstoBalanceArray {
    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(1)
     */
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int maxLen = 1;
        int n = nums.length;
        for (int right = 0; right < n; right++) {
            while (nums[right] > (long)k * nums[left]) {
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return n - maxLen;
    }
}
