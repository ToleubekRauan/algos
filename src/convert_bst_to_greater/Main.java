package convert_bst_to_greater;

import java.util.Collections;

public class Main {

    private static int sum = 0;

    public static void main(String[] args) {
        convertToGreater(null);
    }

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static TreeNode convertToGreater(TreeNode root) {
        if (root != null) {
            convertToGreater(root.right);
            sum += root.val;
            root.val = sum;
            convertToGreater(root.left);
        }

        return root;
    }
}
