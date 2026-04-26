/**
 * The link of this problem is <a href = "https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 25-Apr-26
 * @time: 11:15 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E2515_ShortestDistancetoTargetStringinaCircularArray {
    public int closestTarget(String[] words, String target, int startIndex) {
        int len = words.length;
        int shortestDis = len;

        for (int i = 0; i < len; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                shortestDis = Math.min(shortestDis, Math.min(dist, len-dist));
            }
        }

        if (shortestDis == len) return -1;

        return shortestDis;
    }
}
