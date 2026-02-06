/**
 * The link of this problem is <a href = "https://leetcode.com/problems/valid-anagram/"> here </a>
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 12/23/2025
 * @time: 09:58 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;

public class E242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        int maxCharS = sCharArray[0];
        for (int i = 1; i < sCharArray.length; i++) {
            if (maxCharS < sCharArray[i]) maxCharS = sCharArray[i];
        }
        int[] sCount = new int[maxCharS +1];
        for (int i = 0; i < s.length(); i++) {
            sCount[sCharArray[i]] +=1;
        }
        char[] tCharArray = t.toCharArray();
        int maxCharT = tCharArray[0];
        for (int i = 1; i < tCharArray.length; i++) {
            if (maxCharT < sCharArray[i]) maxCharT = tCharArray[i];
        }
        int[] tCount = new int[maxCharT + 1];
        for (int i = 0; i < s.length(); i ++) {
            tCount[tCharArray[i]] += 1;
        }
        boolean isEqual = Arrays.equals(sCount, tCount);
        return isEqual;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int['z' - 'a'];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
