/**
 * The link of this problem is <a href = "https://leetcode.com/problems/contains-duplicate/"> here </a>
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 12/23/2025
 * @time: 04:30 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.sql.Time;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E217_ContainsDuplicate {
    //Sort method
    //Time complexity: O(nlogn)
    //Space complexity: O(1) or O(n) depending on the sorting algorithm
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    //HashSet check already encountered
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean containDuplite2(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) return true;
            hashSet.add(num);
        }
        return false;
    }

    //HashSet length
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean containDuplite3(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    //HashSet
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean containDuplite4(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) unique.add(num);
        return unique.size() < nums.length;
    }
}
