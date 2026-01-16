/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 12/18/2025
 * @time: 02:40 AM
 * @package: DsaMat3514.BT7_SimpleBST
 */

package DsaMat3514.BT7_SimpleBST;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SimpleBST<Key extends Comparable<Key>> implements SimpleBTreeInterface<Key> {
    class Node {
        Key data;
        Node left, right;

        public Node(Key key) {
            this.data = key;
        }
    }

    private Node root = null;
    int n = 0;

    @Override
    public Iterator<Key> iterator() {
        List<Key> list = new ArrayList<>();
        if (root == null) return list.iterator();
        List<Node> stack = new ArrayList<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.remove(stack.size() - 1);
            list.add(current.data);
            current = current.right;
        }
        return list.iterator();
    }

    @Override
    public void insert(Key k) {
        if (root == null) {
            root = new Node(k);
            n++;
            return;
        }
        Node current = root;
        while (true) {
            int cmp = k.compareTo(current.data);
            if (cmp < 0) {
                if (current.left == null) {
                    current.left = new Node(k);
                    n++;
                    return;
                }
                current = current.left;
            } else if (cmp > 0) {
                if (current.right == null) {
                    current.right = new Node(k);
                    n++;
                    return;
                }
                current = current.right;
            } else {
                return;
            }
        }
    }

    @Override
    public Key search(Key k) {
        Node current = root;
        while (current != null) {
            int cmp = k.compareTo(current.data);
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current=current.right;
            } else {
                return current.data;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public void preTraverse() {
        List<Node> stack = new ArrayList<>();
        if (root == null) return;
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.remove(stack.size() - 1);
            System.out.print(node + " ");

            if (node.right != null) stack.add(node.right);
            if (node.left != null) stack.add(node.left);
        }
    }

    public void postTraverse() {

    }

    public void inTraverse() {
        List<Node> stack = new ArrayList<>();
        if (root == null) return;
        Node current = root;
        while (current != null && !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.remove(stack.size() - 1);
            System.out.print(current + " ");
            current = current.right;
        }
    }

    public static void main(String[] args) {
        SimpleBST<Integer> bst =  new SimpleBST<>();

        int[] data = {5,6,7,1,2,3,8,6,9,0};
        for(int i = 0 ; i < data.length ; i++)
            bst.insert(data[i]);

        System.out.println("All element in tree:");
        System.out.println("All element in tree:");
        int[] t = new int[data.length];
        int id = 0;
        for(int d:bst)
        {
            t[id] = d;
            id++;
        }

        Arrays.sort(t);
        for(int d:t)
        {
            System.out.print(d+" ");
        }

        System.out.println("");
        System.out.println("Size of tree = "+bst.size());

        System.out.println("Search key = 4> "+ bst.search(4));
        System.out.println("Search key = 6> "+bst.search(6));

        System.out.println("Pre-order tree traversal");
        bst.preTraverse();
        System.out.println("Post-order tree traversal");
        bst.postTraverse();
        System.out.println("In-order tree traversal");
        bst.inTraverse();

    }
}
