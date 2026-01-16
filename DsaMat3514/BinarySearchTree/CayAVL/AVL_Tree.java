/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 11/20/2025
 * @time: 02:24 PM
 * @package: DsaMat3514.CayAVL
 */

package DsaMat3514.CayAVL;

public class AVL_Tree {

    // A utility function to get the height
    // of the tree
    public int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    // A utility function to right rotate
    // subtree rooted with y
    public Node rightRotate(Node x) {
        if (x == null) return x;

        Node xL = x.left;
        Node xLR = xL.right;

        xL.right = x;
        x.left = xLR;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        xL.height = 1 + Math.max(height(xL.left), height(xL.right));

        return xL;
    }

    // A utility function to left rotate
    // subtree rooted with x
    public Node leftRotate(Node x) {
        if (x==null) return x;
        Node xR = x.right;
        Node xRL = xR.left;
        xR.left = x;
        x.right = xRL;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        xR.height = 1 + Math.max(height(xR.left), height(xR.right));
        return xR;
    }

    // Get Balance factor of node N
    public int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    public Node insert(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else return node;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }



    // Recursive function to delete a node with
    // given key from subtree with given root.
    // It returns root of the modified subtree.
    public Node deleteNode(Node root, int key) {
        if (root == null) return root;
        if (key > root.key) root.right = deleteNode(root.right, key);
        else if (key < root.key) root.left = deleteNode(root.left, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            Node node = minValueNode(root.right);
            root.key = node.key;
            root.right = deleteNode(root.right, node.key);
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }
        return root;
    }

    public Node minValueNode(Node node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // A utility function to print preorder
    // traversal of the tree.
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
