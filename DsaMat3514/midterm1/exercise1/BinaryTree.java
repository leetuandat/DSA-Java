package DsaMat3514.midterm1.exercise1;

public class BinaryTree {

    /**
     * Tính độ dài nhỏ nhất từ nút gốc (root) đến một nút lá của một cây nhị phân.
     *
     * @param root nút gốc của cây nhị phân
     * @return độ dài nhỏ nhất từ nút gốc (root) đến một nút lá
     */
    public int minDepth(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right ==null) return 1;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    /**
     * Tính tổng giá trị của tất cả các nút nằm ở tầng thứ level trong cây nhị phân.
     *
     * @param root nút gốc của cây nhị phân
     * @param level tầng cần tính tổng (bắt đầu từ 1 cho tầng gốc)
     * @return tổng giá trị của các nút ở tầng level, nếu level vượt quá chiều cao cây thì trả về 0
     */
    public int sumNodesAtLevel(Node root, int level){
        if (root == null) return 0;
        if (level == 1) return root.data;
        int leftSum = sumNodesAtLevel(root.left, level - 1);
        int rightSum = sumNodesAtLevel(root.right, level - 1);
        return leftSum + rightSum;
    }
}
