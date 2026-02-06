/**
 * The link of this problem is <a href = "https://leetcode.com/problems/remove-duplicates-from-sorted-array/"> here </a>.
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 12/26/2025
 * @time: 04:02 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E026_RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        //LinkedHashSet sẽ giữ thứ tự ban đầu
        //Do bài này đã cho array sorted, nếu chưa thì nên dùng TreeSet
        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int i = 0;
        for (int num : unique) {
            nums[i++] = num;
        }
        return unique.size();
    }

    public int removeDuplicates2(int[] nums) {
        //dùng TreeSet sẽ tự sắp xếp thứ tự
        TreeSet<Integer> map = new TreeSet<>();
        for (int num : nums) {
            map.add(num);
        }
        int i = 0;
        for (int num : map) {
            nums[i++] = num;
        }
        return map.size();
    }

    //Two Pointer
    public int removeDuplicates3(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        while (r < n) {
            nums[l] = nums[r];
            while (r < n && nums[l] == nums[r]) {
                r++;
            }
            l++;
        }
        return l;
    }

    public int removeDuplicates4(int[] nums) {
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r-1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}
