/**
 * This class is used to solve Remove Duplicate problem in leetcode.
 * The link of this problem is <a href = "https://leetcode.com/problems/find-smallest-letter-greater-than-target/"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 1/31/2026
 * @time: 09:23 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E744_FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }

    //Binary Search
    public char nextGreatestLetter2(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (right >= left) {
            int mid = left + (right-left)/2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }
}
