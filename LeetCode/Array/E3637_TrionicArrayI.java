/**
 * The link of this problem is <a href = "https://leetcode.com/problems/trionic-array-i/"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/3/2026
 * @time: 05:00 PM
 * @package: LeetCode.Array
 */
 
package LeetCode.Array;

public class E3637_TrionicArrayI {
    /**
     * TwoPointers
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        if (len <= 3) return false;
        int p = 0;
        int q = len - 1;
        while (p < len-1 && nums[p] < nums[p + 1]) {
            p++;
        }
        while (q > 0 && nums[q] > nums[q-1]) {
            q--;
        }
        if (p == 0 || q == len-1 || p >= q) {
            return false;
        }
        for (int i = p; i < q; i++) {
            if (nums[i] <= nums[i+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * BruteForce
     * Time Complexity: O(n^3)
     * Space Complexity: O(1)
     */
    public boolean isTrionic2(int[] nums) {
        int len = nums.length;;
        if (len < 4) return false;
        for (int p = 1; p < len - 2; p++) {
            for (int q = p + 1; q < len - 1; q++) {
                if (isStrictlyIncreasing(nums, 0 , p) &&
                    isStrictlyDecreasing(nums, p, q) &&
                    isStrictlyIncreasing(nums, q, len - 1))
                    return true;
            }
        }
        return false;
    }

    public boolean isStrictlyIncreasing(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] >= nums[i+1]) return false;
        }
        return true;
    }

    public boolean isStrictlyDecreasing(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] <= nums[i++]) return false;
        }
        return true;
    }
}
