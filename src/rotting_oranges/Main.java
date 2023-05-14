package rotting_oranges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[][] arr2 = {
                {2, 1, 1}, {1, 1, 0}, {0, 1, 1}
        };

        int[][] arr3 = {
                {2, 1, 1}, {0,1,1}, {1,0,1}
        };

        int[][] arr = {
                {0,2}
        };
        System.out.println(orangesRotting(arr));
    }


    static int orangesRotting(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        int mins = 0;

        Queue<Integer[]> list = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    list.add(new Integer[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }
        if (list.isEmpty()) {
            return -1;
        }

        while (fresh > 0) {
            int size = list.size();
            int tmp = fresh;

            for (int i = 0; i < size; i++) {
                Integer[] curr = list.poll();
                int x = curr[0], y = curr[1];
                if (x + 1 < grid.length && !seen[x + 1][y] && grid[x + 1][y] == 1) {
                    seen[x + 1][y] = true;
                    fresh--;
                    list.add(new Integer[]{x + 1, y});
                }
                if (x - 1 >= 0 && !seen[x - 1][y] && grid[x - 1][y] == 1) {
                    seen[x - 1][y] = true;
                    fresh--;
                    list.add(new Integer[]{x - 1, y});
                }
                if (y + 1 < grid[0].length && !seen[x][y + 1] && grid[x][y + 1] == 1) {
                    seen[x][y + 1] = true;
                    fresh--;
                    list.add(new Integer[]{x, y + 1});
                }
                if (y - 1 >= 0 && !seen[x][y - 1] && grid[x][y - 1] == 1) {
                    seen[x][y - 1] = true;
                    fresh--;
                    list.add(new Integer[]{x, y - 1});
                }
            }

            if (tmp == fresh) {
                return -1;
            }



            mins++;
        }


        return mins;
    }
}
