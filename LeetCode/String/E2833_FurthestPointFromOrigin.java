/**
 * The link of this problem is <a href = "https://leetcode.com/problems/furthest-point-from-origin/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 24-Apr-26
 * @time: 11:24 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class E2833_FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blank = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else blank++;
        }

        return Math.abs(left - right) + blank;
    }
}
