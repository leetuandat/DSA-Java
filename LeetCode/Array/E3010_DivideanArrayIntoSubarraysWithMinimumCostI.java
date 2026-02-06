/**
 * The link of this problem is <a href = "https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 2/1/2026
 * @time: 11:44 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;

public class E3010_DivideanArrayIntoSubarraysWithMinimumCostI {

    //brute force
    public int minimumCost(int[] nums) {
        int len = nums.length;
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j<len; j++) {
                int cost = nums[0] + nums[i] + nums[j];
                result = Math.min(result, cost);
            }
        }
        return result;
    }

    public int minimumCost2(int[] nums) {
        int n = nums.length;
        int score = nums[0];
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin){
                secondMin = nums[i];
            }
        }
        return score + firstMin + secondMin;
    }
}
