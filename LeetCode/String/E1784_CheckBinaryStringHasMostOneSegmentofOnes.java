/**
 * The link of this problem is <a href = "https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 07-Mar-26
 * @time: 08:44 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class E1784_CheckBinaryStringHasMostOneSegmentofOnes {
    public boolean checkOnesSegment(String s) {
//        return !s.contains("01");

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == '0' && s.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }

}
