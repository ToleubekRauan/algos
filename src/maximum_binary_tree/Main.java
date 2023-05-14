package maximum_binary_tree;

public class Main {

    public static void main(String[] args) {
    }

    static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = new TreeNode();
        construct(nums, 0, nums.length, root);
        return root;
    }

    static void construct(int[] nums, int s, int e, TreeNode root) {
        if (s == e) return;
        int pos = s;
        for (int i = s; i < e; i++) {
            if (nums[i] > nums[pos]) {
                pos = i;
            }
        }
        root.val = nums[pos];
        if (s < pos) {
            root.left = new TreeNode();
            construct(nums, s, pos - 1, root.left);
        }
        if (pos < e) {
            root.right = new TreeNode();
            construct(nums, pos + 1, e, root.right);
        }
    }

    static class TreeNode {
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
}
