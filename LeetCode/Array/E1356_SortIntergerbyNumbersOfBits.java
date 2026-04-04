/**
 * The link of this problem is <a href = "https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits"> here </a>.
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/25/2026
 * @time: 11:08 PM
 * @package: LeetCode.Array
 */
 
package LeetCode.Array;

import java.util.Arrays;

public class E1356_SortIntergerbyNumbersOfBits {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 100001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100001;
        }
        return arr;
    }
}
