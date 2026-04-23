/**
 * The link of this problem is <a href = "https://leetcode.com/problems/sum-of-distances/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 23-Apr-26
 * @time: 10:16 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class M2615_SumofDistances {
    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Time Limit Exceeded
     */
    public long[] distance(int[] nums) {
        int len = nums.length;
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j]) {
                    sum += Math.abs(j-i);
                }
            }
            arr[i] = sum;
        }
        return arr;
    }
}
