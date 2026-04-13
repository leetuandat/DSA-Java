/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-distance-to-the-target-element"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 13-Apr-26
 * @time: 11:54 AM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E1848_MinimumDistancetoTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;
        int minimized = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                minimized = Math.min(Math.abs(i - start), minimized);
            }
        }
        return minimized;
    }
}
