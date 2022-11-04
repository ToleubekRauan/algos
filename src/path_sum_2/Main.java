package path_sum_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        dfs(root, inner, targetSum, list);
        return list;
    }

    static void dfs(TreeNode root, List<Integer> inner, int target, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (inner.stream().reduce(0, Integer::sum) + root.val == target) {
                inner.add(root.val);
                list.add(inner);
            }
            return;
        }
        inner.add(root.val);
        dfs(root.left, new ArrayList<Integer>(inner), target, list);
        dfs(root.right, new ArrayList<Integer>(inner), target, list);
    }

    static class TreeNode {
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

}
