/**
 * The link of this problem is <a href = "https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/7/2026
 * @time: 11:35 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class M1653_MinimumDeletionstoMakeStringBalanced {
    /**
     * Brute Force
     * Time Complexity: O(n^2)
     */
    public int minimumDeletions(String s) {
        int n = s.length();
        int minDeletions = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            int deletions = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == 'b') {
                    deletions++;
                }
            }
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'a') {
                    deletions++;
                }
            }
            minDeletions = Math.min(minDeletions, deletions);
        }
        return minDeletions;
    }

    /**
     * Time Complexity: O(n)
     */
    public int minimumDeletions2(String s) {
        int countB = 0;
        int deletions = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                countB++;
            } else {
                deletions = Math.min(deletions + 1, countB);
            }
        }
        return deletions;
    }
}
