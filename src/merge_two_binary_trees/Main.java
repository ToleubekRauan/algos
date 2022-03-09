package merge_two_binary_trees;

public class Main {

    public static class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {
        TreeNode root1 = null, root2 = null;
        mergeTrees(root1, root2);
    }


    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        int left = (root1 == null) ? 0 : root1.val;
        int right = (root2 == null) ? 0 : root2.val;
        TreeNode node = new TreeNode(left + right);
        node.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        node.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);


        return node;

    }
}
