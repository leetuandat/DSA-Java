/**
 * The link of this problem is <a href = "https://leetcode.com/problems/power-of-two"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 09:06 AM
 * @package: LeetCode.Math
 */

package LeetCode.Math;

public class E231_PowerofTwo {
    //Time Complexity depend on argument n, the value of n is halved after each call. => O(logn)

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n/2);
    }

    //Bit Manipulation (thao tác trên bit)
    //O(1)
    public boolean isPowerOfTwo2(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
    //Ex: n=8 => 8 = 1000, 7 = 0111
    //1000
    //0111
    //0000
}
