package DsaMat3514.midterm2.exercise1;

public class BinaryTree {

    /**
     * Tìm giá trị của nút lá có giá trị nhỏ nhất.
     *
     * @param root nút gốc của cây nhị phân
     * @return giá trị nút lá nhỏ nhất
     */
    public int minLeafValue(Node root){
        // TODO
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return root.data;
        int leftMin = minLeafValue(root.left);
        int rightMin = minLeafValue(root.right);
        return Math.min(leftMin, rightMin);
    }

    /**
     * Đếm số nút nằm ở tầng thứ level trong cây nhị phân.
     *
     * @param root nút gốc của cây nhị phân
     * @param level tầng cần đếm số nút (bắt đầu từ 1 cho tầng gốc)
     * @return số nút ở tầng thứ level; nếu level vượt quá chiều cao cây thì trả về 0
     */
    public int countNodesAtLevel(Node root, int level){
        // TODO
        if (root == null || level < 1) return 0;
        if (level == 1) return 1;

        int leftCount = countNodesAtLevel(root.left, level-1);
        int rightCount = countNodesAtLevel(root.right, level-1);
        return leftCount + rightCount;
    }
}