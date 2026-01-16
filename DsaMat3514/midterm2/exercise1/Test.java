package DsaMat3514.midterm2.exercise1;

public class Test {
    public static void main(String[] args) {
        // Xây dụng cây như hình minh họa trong đề
        Node root = new Node(18);

        Node node1 = new Node(35);
        Node node2 = new Node(24);

        Node node3 = new Node(31);
        Node node4 = new Node(88);

        Node node5 = new Node(36);
        Node node6 = new Node(10);

        Node node7 = new Node(67);
        Node node8 = new Node(37);

        Node node9 = new Node(69);

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

        System.out.println("Giá trị của lá có giá trị nhỏ nhất: "
                + binaryTree.minLeafValue(root) + "\n"); // Kết quả đúng: 36

        System.out.println("Số nút ở tầng 4: "
                + binaryTree.countNodesAtLevel(root, 4) + "\n"); // Kết quả đúng 3
    }
}
