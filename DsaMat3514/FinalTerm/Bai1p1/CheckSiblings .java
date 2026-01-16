package DsaMat3514.FinalTerm.Bai1p1;

@SuppressWarnings({"unchecked", "deprecation"})
class CheckSiblings  {
    public boolean areSiblings(Node root, int val1, int val2) {
        if (root == null) return false;
        if (root.left != null && root.right != null) {
            if (root.left.value == val1 && root.right.value == val2
            || root.left.value == val2 && root.right.value == val1) {
                return true;
            }
        }
        return areSiblings(root.left, val1, val2) || areSiblings(root.right,val1, val2);
    }

}