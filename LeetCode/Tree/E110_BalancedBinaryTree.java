/**
 * The link of this problem is <a href = "https://leetcode.com/problems/balanced-binary-tree/"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 2/8/2026
 * @time: 11:54 PM
 * @package: LeetCode.Tree
 */

package LeetCode.Tree;

public class E110_BalancedBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        private int checkHeight(TreeNode node) {
            if (node == null) return 0;
            int leftHeight = checkHeight(node.left);
            if (leftHeight == -1) return -1;
            int rightHeight = checkHeight(node.right);
            if (rightHeight == -1) return -1;
            if (Math.abs(leftHeight - rightHeight) > 1) return -1;
            return Math.abs(leftHeight - rightHeight) + 1;
        }

        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != -1;
        }
    }
}
