package min_height_bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,7,10,13,14,15,22);
        BST bst = minHeightBst(list);

        dfs(bst);
    }

    public static BST minHeightBst(List<Integer> array) {
      return helper(array, null, 0 ,array.size() - 1);
    }

    private static void dfs(BST bst) {
        helperDFS(bst.left);
        System.out.println(bst.value);
        helperDFS(bst.right);
    }

    private static void helperDFS(BST bst) {
        if (bst == null) return;
        if (bst.left == null && bst.right == null) {
            System.out.println(bst.value);
        }
        helperDFS(bst.left);
        helperDFS(bst.right);
    }

    private static BST helper(List<Integer> array, BST bst, int start, int end) {
        if (end < start) return null;
        int mid = (start + end) / 2;
        int value = array.get(mid);
        if (bst == null) {
            bst = new BST(value);
        }else {
            bst.insert(value);
        }
        helper(array, bst, start, mid - 1);
        helper(array, bst, mid + 1, end);
        return bst;
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
