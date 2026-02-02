/**
 * This class is used to solve Remove Duplicate problem in leetcode.
 * The link of this problem is <a href = "https://leetcode.com/problems/valid-palindrome/"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 1/31/2026
 * @time: 04:03 PM
 * @package: LeetCode.TwoPointers
 */

package LeetCode.TwoPointers;

public class E125_ValidPalindrome {
    //String builder
    //Time complexity: O(n)
    //Space complexity: O(n)
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.length() == 0) return true;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(c);
        }
        String s2 = stringBuilder.reverse().toString();
        return s.equals(s2);
    }

    //String bulider
    //Time complexity: O(n)
    //Space complexity: O(n)
    public boolean isPalindrome2(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }

    //Two pointer
    //Time complexity O(n)
    //Space complexity O(1)
    public boolean isPalindrome3(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int l = 0;
        int r = s.length() - 1;
        while (r > l) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    //Two pointer
    //Time complexity O(n)
    //Space complexity O(1)
    public boolean isPalindrome4(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
