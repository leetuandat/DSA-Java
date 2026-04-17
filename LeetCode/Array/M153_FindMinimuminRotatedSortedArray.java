/**
 * The link of this problem is <a href = "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 17-Apr-26
 * @time: 11:54 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;

public class M153_FindMinimuminRotatedSortedArray {
    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(logn) - even without creating a new array, the sorting algorithm requires stack space,
     */
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findMin2(int[] nums) {
        int len = nums.length;
        int min = nums[0];
        for (int i = 0; i < len; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public int findMin3(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }

    /**
     * Binary Search - Lower Bound
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     */
    public int findMin4(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right > left) {
            int mid = left + (right - left)/2;;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    /**
     * Binary Search
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     */
    public int findMin5(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums[0];
        while (right >= left) {
            if (nums[left] < nums[right]) {
                res = Math.min(res, nums[left]);
                break;
            }
            int mid = left + (right - left) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
