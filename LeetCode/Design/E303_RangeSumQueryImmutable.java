/**
 * The link of this problem is <a href = "https://leetcode.com/problems/range-sum-query-immutable"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 08-Apr-26
 * @time: 12:18 PM
 * @package: LeetCode.Design
 */

package LeetCode.Design;

public class E303_RangeSumQueryImmutable {
    class NumArray {
        private int[] prefixSum;

        public NumArray(int[] nums) {
            prefixSum = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefixSum[i + 1] = prefixSum[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSum[right + 1] - prefixSum[left];
        }

    }
}
