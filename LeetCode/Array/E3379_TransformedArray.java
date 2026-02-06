/**
 * The link of this problem is <a href = "https://leetcode.com/problems/transformed-array/"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/5/2026
 * @time: 10:22 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E3379_TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                int step = (i + nums[i]) % len;
                result[i] = nums[step];
            } else if (nums[i] < 0) {
                int step = ((i + nums[i]) % len + len) % len;
                result[i] = nums[step];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
