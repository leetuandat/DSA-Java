/**
 * The link of this problem is <a href = "https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 12-Mar-26
 * @time: 05:08 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class M80_RemoveDuplicateII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int l = 1;
        int count = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] == nums[r-1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

    public int removeDuplicates2(int[] nums) {
        int l = 2;
        if (nums.length <= 2) return nums.length;
        for (int r = 2; r < nums.length; r++) {
            if (nums[r] != nums[l-2]) {
                nums[l++] = nums[r];
            }
        }
        return l;
    }
}
