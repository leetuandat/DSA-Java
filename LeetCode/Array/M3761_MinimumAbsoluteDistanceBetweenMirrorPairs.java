/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 17-Apr-26
 * @time: 10:55 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.HashMap;

public class M3761_MinimumAbsoluteDistanceBetweenMirrorPairs {

    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Space Complexity O(n)
     */
    public int minMirrorPairDistance(int[] nums) {
        int len = nums.length;
        int minDis = Integer.MAX_VALUE;
        int[] reveredArr = new int[len];
        for (int i = 0; i < len; i++) {
            reveredArr[i] = reverseNums(nums[i]);
        }
        for (int i = 0; i < len - 1; i++) {
            int target = reveredArr[i];
            for (int j = i + 1; j < len; j++) {
                if (target == nums[j]) {
                    int dist = j - i;
                    if (dist < minDis) {
                        minDis = dist;
                    }
                    if (minDis == 1) return 1;
                }
            }
        }
        return (minDis == Integer.MAX_VALUE) ? -1 : minDis;
    }

    public int reverseNums(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x/=10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return rev;
    }

    /**
     * HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int minMirrorPairDistance2(int[] nums) {
        int len = nums.length;
        int minDis = Integer.MAX_VALUE;
        HashMap<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (lastSeen.containsKey(nums[i])) {
                minDis = Math.min(minDis, i - lastSeen.get(nums[i]));
            }
            int reversed = reverseNums(nums[i]);
            lastSeen.put(reversed, i);
        }
        return (minDis == Integer.MAX_VALUE) ? -1 : minDis;
    }
}
