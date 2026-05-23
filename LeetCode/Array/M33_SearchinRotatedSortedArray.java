/**
 * The link of this problem is <a href = "https://leetcode.com/problems/search-in-rotated-sorted-array"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 22-May-26
 * @time: 04:15 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class M33_SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Nửa trái đang sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Nửa phải đang sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
