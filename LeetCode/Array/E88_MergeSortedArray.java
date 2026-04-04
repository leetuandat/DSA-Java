/**
 * The link of this problem is <a href = "https://leetcode.com/problems/merge-sorted-array"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 10-Mar-26
 * @time: 08:05 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m-n && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
            while (i < m-n) result[k++] = nums1[i++];
            while (j < n) result[k++] = nums1[j++];
        }
        for (int x = 0; x < m+n; x++) {
            nums1[x] = result[x];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
