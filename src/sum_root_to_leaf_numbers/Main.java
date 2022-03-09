package sum_root_to_leaf_numbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0));
        //TreeNode node = new TreeNode(9);
        System.out.println("sum = " + sumNumbers(node));
    }

    public static int sumNumbers(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        List<Integer> list = new ArrayList<>();
        helper(root, "", list);
        System.out.println(list);

        return sum(list);
    }

    private static void helper(TreeNode root, String str, List<Integer> list) {
        if (root == null) {
            return;
        }
        str += root.val;
        if (root.left == null && root.right == null) {
            list.add(Integer.parseInt(str));
            return;
        }
        helper(root.left, str, list);
        helper(root.right, str, list);
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static class TreeNode {
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
