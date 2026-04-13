/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 10-Apr-26
 * @time: 04:49 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class E3740_MinimumDistanceBetweenThreeEqualElementsI {
    public int minimumDistance(int[] nums) {
        if (nums.length < 3) return -1;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if(nums[i] != nums[j]) continue;
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] == nums[k]) {
                        minDis = Math.min(minDis, k-i);
                    }
                }
            }
        }
        return (minDis == Integer.MAX_VALUE) ? -1 : 2*minDis;
    }

    public int minimumDistance2(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
        for (int k = 0; k < nums.length; k++) {
            int val = nums[k];
            if (!map.containsKey(val)) {
                map.put(val, new int[] {-1, -1});
            }
            int[] indices = map.get(val);
            int i = indices[0];
            int j = indices[1];
            if (i != -1 && j != -1) {
                int dist = 2 * (k - i);
                if (dist < minDist) {
                    minDist = dist;
                }
            }
            indices[0] = j;
            indices[1] = k;
        }
        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
}
