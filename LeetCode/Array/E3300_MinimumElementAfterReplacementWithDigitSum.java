/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 30-May-26
 * @time: 07:04 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;

public class E3300_MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int num = nums[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            nums[i] = sum;
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
