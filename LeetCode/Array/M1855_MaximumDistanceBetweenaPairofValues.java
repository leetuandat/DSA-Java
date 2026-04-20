/**
 * The link of this problem is <a href = "https://leetcode.com/problems/maximum-distance-between-a-pair-of-values"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 20-Apr-26
 * @time: 01:12 AM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class M1855_MaximumDistanceBetweenaPairofValues {

    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * In leetcode submition this solution is time limit exceeded
     */
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDis = Integer.MIN_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] <= nums2[j]) {
                    if (i <= j) {
                        maxDis = Math.max(maxDis, j - i);
                    }
                } else {
                    continue;
                }
            }
        }
        return (maxDis == Integer.MIN_VALUE) ? 0 : maxDis;
    }

    /**
     * Two Pointers
     * Time Complexity: O(m+n) m is length of nums1, n is length of nums2
     * Space Complexity: O(1)
     * In else case j++ because we need i <= j, i and j start at index 0 so j++ is needed
     */
    public int maxDistance2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int maxDis = 0;
        while (i < nums1.length && j < nums2.length) {
                if (i > j) {
                    j = i;
                    if (j >= nums2.length) break;
                }
                if (nums1[i] <= nums2[j]) {
                    maxDis = Math.max(maxDis, j- i);
                    j++;
                } else {
                    i++;
                    j++;
                }
        }
        return maxDis;
    }

    /**
     * Binary Search
     */
    public int maxDistance3(int[] nums1, int[] nums2) {
        int maxDist = 0;
        for (int i = 0; i < nums1.length; i++) {
            int left = i;
            int right = nums2.length;
            int bestJ = -1;
            while (left < right) {
                int mid = left + (right - left)/2;
                if (nums2[mid] >= nums1[i]) {
                    bestJ = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (bestJ != -1) {
                maxDist = Math.max(maxDist, bestJ - i);
            }
        }
        return maxDist;
    }
    
}
