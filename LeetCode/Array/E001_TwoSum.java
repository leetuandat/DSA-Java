/**
 * This class is used to solve TwoSum problem in leetcode.
 * The link of this problem is <a href = "https://leetcode.com/problems/two-sum/"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 12/25/2025
 * @time: 07:48 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class E001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        };
        Arrays.sort(A, Comparator.comparingInt(value -> value[0]));
        int i = 0;
        int j = nums.length - 1;

        while (j > i) {
            int curr = A[i][0] + A[j][0];
            if (curr == target) {
                return new int[]{Math.min(A[i][1], A[j][1]), Math.max(A[i][1], A[j][1])};
            } else if (curr < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && map.get(need) != i) {
                return new int[]{i, map.get(need)};
            }
        }
        return new int[0];
    }

}
