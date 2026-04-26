/**
 * The link of this problem is <a href = "https://leetcode.com/problems/sum-of-distances/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 23-Apr-26
 * @time: 10:16 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M2615_SumofDistances {
    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Time Limit Exceeded
     */
    public long[] distance(int[] nums) {
        int len = nums.length;
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                if (nums[i] == nums[j]) {
                    sum += Math.abs(j-i);
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

    public long[] distance2(int[] nums) {
        int n = nums.length;;
        long[] res = new long[n];
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < n; i++) {
            groups.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> idx : groups.values()) {
            int m = idx.size();
            long[] pre = new long[m+1];
            for (int k = 0; k < m; k++) {
                pre[k+1] = pre[k] + idx.get(k);
            }

            for (int k = 0; k < m; k++) {
                long curr = idx.get(k);
                long left = curr * k - pre[k];
                long right = (pre[m] - pre[k + 1]) - curr * (m - k -1);
                res[idx.get(k)] = left + right;
            }
        }
        return res;
    }
}
