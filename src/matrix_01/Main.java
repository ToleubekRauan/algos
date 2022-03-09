package matrix_01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        System.out.println(Arrays.deepToString(updateMatrix(arr)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] output = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int res = Integer.MAX_VALUE;
                boolean[][] seen = new boolean[mat.length][mat[0].length];
                res = Math.min(res, helper(mat, i, j, seen));
                output[i][j] = res;
            }
        }

        return output;
    }

    private static int helper(int[][] mat, int x, int y, boolean[][] seen) {
        if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length || mat[x][y] == 0 || seen[x][y]) {
            return 0;
        }
        seen[x][y] = true;

        return (1 + helper(mat, x + 1, y, seen) + helper(mat, x - 1, y, seen) + helper(mat, x, y + 1, seen) +
                helper(mat, x, y - 1, seen));
    }
}
