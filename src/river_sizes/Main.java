package river_sizes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };
        System.out.println(riverSizes(matrix));
    }


    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(traverse(i, j, matrix, visited));
            }
        }
        list.removeIf(el -> el == 0);
        return list;
    }

    private static int traverse(int i, int j, int[][] matrix, boolean[][] seen) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0 || seen[i][j]) {
            return 0;
        }
        seen[i][j] = true;
        return 1 + traverse(i + 1, j, matrix, seen) + traverse(i - 1, j, matrix, seen) +
                traverse(i, j + 1, matrix, seen) + traverse(i, j - 1, matrix, seen);

    }
}
