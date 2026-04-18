/**
 * The link of this problem is <a href = "https://leetcode.com/problems/mirror-distance-of-an-integer/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 18-Apr-26
 * @time: 10:57 AM
 * @package: LeetCode.Math
 */

package LeetCode.Math;

public class E3783_MirrorDistanceofanInteger {
    public int mirrorDistance(int n) {
        return Math.abs(reversed(n) - n);
    }
    public int reversed(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num/=10;
        }
        return rev;
    }
}
