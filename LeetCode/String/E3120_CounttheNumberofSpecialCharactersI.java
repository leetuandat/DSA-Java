/**
 * The link of this problem is <a href = "https://leetcode.com/problems/count-the-number-of-special-characters-i"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 26-May-26
 * @time: 10:44 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

import java.util.HashSet;
import java.util.Set;

public class E3120_CounttheNumberofSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for(char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * HashSet
     */
    public int numberOfSpecialChars2(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.add(c);
            } else {
                upper.add(c);
            }
        }

        int count = 0;
        for (char c : lower) {
            if (upper.contains(Character.toUpperCase(c))) {
                count++;
            }
        }
        return count;
    }
}
