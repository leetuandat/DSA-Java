/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 08-Mar-26
 * @time: 01:31 AM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class M1888_MinimumNumberFlipMakeBInaryString {

    /**
     * Sliding Window
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int minFlips(String s) {
        String s2 = s+s;
        int len = s.length();
        int minFlip = Integer.MAX_VALUE;
        int count = 0;
        for (int right = 0; right < s2.length(); right++) {
            if (s2.charAt(right) != (right % 2 == 0 ? '0' : '1')) count++;
            if (right >= len) {
                int left = right - len;
                if (s2.charAt(left) != (left % 2 == 0 ? '0' : '1')) count--;
            }
            if (right >= len - 1) minFlip = Math.min(minFlip, Math.min(count, len - count));
        }
        return minFlip;
    }

    /**
     * Sliding Window
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public int minFlips2(String s) {
        int len = s.length();
        int count = 0;
        int minFlip = Integer.MAX_VALUE;
        for (int right = 0; right < 2*len; right++) {
            if (s.charAt(right % len) != (right % 2 == 0 ? '0' : '1')) count++;
            if (right >= len) {
                int left = right - len;
                if (s.charAt(left % len) != (left % 2 == 0 ? '0' : '1')) count--;
            }
            if (right >= len - 1) minFlip = Math.min(minFlip, Math.min(count, len - count));
        }
        return minFlip;
    }
}
