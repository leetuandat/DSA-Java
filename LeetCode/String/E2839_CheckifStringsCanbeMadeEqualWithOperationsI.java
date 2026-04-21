/**
 * The link of this problem is <a href = "https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 21-Apr-26
 * @time: 12:41 AM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class E2839_CheckifStringsCanbeMadeEqualWithOperationsI {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (swap(s1, 0, 2).equals(s2)) return true;
        if (swap(s1, 1, 3).equals(s2)) return true;
        String s = swap(s1, 0, 2);
        if (swap(s, 1, 3).equals(s2)) return true;
        return false;
    }

    public String swap(String str, int i, int j) {
        if (str == null || i < 0 || j < 0 || i >= str.length() || j >= str.length()) return str;
        StringBuilder stringBuilder = new StringBuilder(str);
        char temp = stringBuilder.charAt(i);
        stringBuilder.setCharAt(i, stringBuilder.charAt(j));
        stringBuilder.setCharAt(j, temp);
        return stringBuilder.toString();
    }

    public boolean canBeEqual2(String s1, String s2) {
        return ((s1.charAt(0) == s2.charAt(0)) && (s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2)) && (s1.charAt(2) == s2.charAt(0))) &&
                ((s1.charAt(1) == s2.charAt(1)) && (s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3)) && (s1.charAt(3) == s2.charAt(1)));
    }
}
