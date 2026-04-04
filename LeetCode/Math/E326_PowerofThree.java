/**
 * The link of this problem is <a href = "https://leetcode.com/problems/power-of-three"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 10:16 AM
 * @package: LeetCode.Math
 */

package LeetCode.Math;

public class E326_PowerofThree {
    public boolean isPowerOfThree(int n) {
        if (n < 0) return false;
        if (n == 1) return true;
        if (n % 3 != 0) return false;
        return isPowerOfThree(n/3);
    }

    //since n in an int (32-bit), if it's a positive integer, its value range is from 0 to 4,294,967,296
    //If it's a signed integer, its value range is from -2,147,483,648 to 2,147,483,647
    //So the largest power of 3 that can be stored is 3^19
    public boolean isPowerOfThree2(int n) {
        int maxPowerof3 = (int) Math.pow(3, 19);
        return n > 0 && maxPowerof3 % n == 0;
    }
}
