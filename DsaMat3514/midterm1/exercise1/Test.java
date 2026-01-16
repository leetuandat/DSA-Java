package DsaMat3514.midterm1.exercise1;

public class Test {
    public static void main(String[] args) {
        // Xây dụng cây như hình minh họa trong đề
        Node root = new Node(67);

        Node node1 = new Node(35);
        Node node2 = new Node(37);

        Node node3 = new Node(31);
        Node node4 = new Node(33);

        Node node5 = new Node(36);
        Node node6 = new Node(69);

        Node node7 = new Node(18);
        Node node8 = new Node(24);

        Node node9 = new Node(10);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        node3.left = node7;
        node3.right = node8;
        node6.right = node9;

        BinaryTree binaryTree = new BinaryTree();

        System.out.println(root.left.data);
        System.out.println("Đường đi ngắn nhất từ gốc tới một lá: "
                + binaryTree.minDepth(root) + "\n"); // Kết quả đúng: 3

        System.out.println("Tổng giá trị các nút ở hàng 3: "
                + binaryTree.sumNodesAtLevel(root, 3) + "\n"); // Kết quả đúng 169
    }
}
