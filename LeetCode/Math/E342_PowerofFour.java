/**
 * The link of this problem is <a href = "https://leetcode.com/problems/power-of-four"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 10:50 AM
 * @package: LeetCode.Math
 */

package LeetCode.Math;

public class E342_PowerofFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return isPowerOfFour(n/4);
    }
}
