package tree;

public class BinarySearchTree {
    private TreeNode root;

    public void add(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        TreeNode cur = root, pre = null;
        while (cur != null) {
            if (cur.val == val) {
                return;
            }
            pre = cur;
            if (cur.val < val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        TreeNode node = new TreeNode(val);
        if (pre.val < val) {
            pre.right = node;
        } else {
            pre.left = node;
        }
    }
}


class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
