package count_good_nodes;

public class Main {

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int goodNodes(TreeNode root) {
        Integer cnt = 0;
        dfs(root, root.val, cnt);
        return cnt;
    }

    static void dfs(TreeNode root, int max, Integer cnt) {
        if (root == null) return;

        if (root.val >= max) {
            System.out.println("val = " + root.val);
            cnt++;
        }

        if (root.left != null) {
            dfs(root.left, Math.max(max, root.val), cnt);
        }
        if (root.right != null) {
            dfs(root.right, Math.max(max, root.val), cnt);
        }
    }
}
