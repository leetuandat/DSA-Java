/**
 * The link of this problem is <a href = "https://leetcode.com/problems/binary-search/"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 2/3/2026
 * @time: 02:06 AM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E704_BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
