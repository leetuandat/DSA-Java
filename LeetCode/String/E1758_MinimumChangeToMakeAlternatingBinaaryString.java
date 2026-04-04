/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 07-Mar-26
 * @time: 08:38 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class E1758_MinimumChangeToMakeAlternatingBinaaryString {
    public int minOperations(String s) {
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == (i%2 == 0 ? '0' : '1')) {
                count++;
            }
        }
        return Math.min(count, len-count);
    }
}
