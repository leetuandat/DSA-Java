/**
 * The link of this problem is <a href = "https://leetcode.com/problems/remove-element/"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 12-Mar-26
 * @time: 09:01 PM
 * @package: LeetCode.Array
 */
 
package LeetCode.Array;

public class E27_RemoveElement {
    /**
     * Two Pointers
     * Time Complexity: O(n)
     */
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right-1];
                right--;
            } else {
                left++;
            }
        }
        return right;
    }

    /**
     * Return the number who diff with val to front
     * Time Complexity: O(n)
     */
    public int removeElement2(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
