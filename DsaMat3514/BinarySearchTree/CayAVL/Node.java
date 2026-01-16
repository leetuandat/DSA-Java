/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 11/20/2025
 * @time: 02:24 PM
 * @package: DsaMat3514.CayAVL
 */

package DsaMat3514.CayAVL;

public class Node {
    int key;
    Node left;
    Node right;
    int height;

    Node(int k) {
        key = k;
        left = null;
        right = null;
        height = 1;
    }
}
