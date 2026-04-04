/**
 * The link of this problem is <a href = "https://leetcode.com/problems/palindrome-number"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 09:25 AM
 * @package: LeetCode.Math
 */
 
package LeetCode.Math;

public class E9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == temp;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || ((x % 10 == 0) && x != 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
