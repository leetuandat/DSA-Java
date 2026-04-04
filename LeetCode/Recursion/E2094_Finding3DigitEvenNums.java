/**
 * The link of this problem is <a href = "https://leetcode.com/problems/finding-3-digit-even-numbers"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 01-Apr-26
 * @time: 06:06 PM
 * @package: LeetCode.Recursion
 */

package LeetCode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class E2094_Finding3DigitEvenNums {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int digit : digits) {
            count[digit]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 100; i < 999; i+=2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            count[hundreds]--;
            count[tens]--;
            count[units]--;

            if (count[hundreds] >= 0 && count[tens] >= 0 && count[units] >= 0) {
                result.add(i);
            }
            count[hundreds]++;
            count[tens]++;
            count[units]++;
        }
        int[] ans = new int[result.size()];
        for (int i = 0 ; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
