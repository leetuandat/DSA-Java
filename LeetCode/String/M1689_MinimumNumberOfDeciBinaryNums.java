/**
 * The link of this problem is <a href = "https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 3/1/2026
 * @time: 10:50 AM
 * @package: LeetCode.String
 */

package LeetCode.String;

import java.util.Arrays;
import java.util.Map;

public class M1689_MinimumNumberOfDeciBinaryNums {
    public int minPartitions(String n) {
        int max = n.length();
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = n.charAt(i) - '0';
        }
        Arrays.sort(arr);
        return arr[max-1];
    }

    public int minPartitions2(String n) {
        int max = -1;
        int len = n.length();
        for (int i = 0; i < len; i++) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }

    public int minPartitions3(String n) {
        for (int i = 9; i > 0; i--) {
            if (n.contains(i+"")) return i;
        }
        return 0;
    }

    public int minPartitions4(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int val = n.charAt(i) - '0';
            if (val > max) {
                max = val;
                if (max == 9) return 9;
            }
        }
        return max;
    }
}
