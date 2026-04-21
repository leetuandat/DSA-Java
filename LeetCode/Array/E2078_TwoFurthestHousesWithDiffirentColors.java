/**
 * The link of this problem is <a href = "https://leetcode.com/problems/two-furthest-houses-with-different-colors/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: LeetCode
 * @date: 21-Apr-26
 * @time: 12:03 AM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

public class E2078_TwoFurthestHousesWithDiffirentColors {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int maxDistance(int[] colors) {
        int left = 0;
        int right = colors.length - 1;
        int maxDis = 0;
        while (colors[left] == colors[right]) {
            left++;
        }
        maxDis = Math.max(maxDis, right - left);
        right = colors.length - 1;
        while (colors[0] == colors[right]) {
            right--;
        }
        maxDis = Math.max(maxDis, right - left);
        return maxDis;
    }

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int maxDistance2(int[] colors) {
        int n = colors.length;
        int result = 0;
        for (int i = 0; i < n ; i++) {
            if (colors[i] != colors[0]) {
                result = Math.max(result, i);
            }
            if (colors[i] != colors[n-1]) {
                result = Math.max(result, n - 1 - i);
            }
        }
        return result;
    }
}