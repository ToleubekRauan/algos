package count_unguarded_cells;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int[][] guards = {
                {0,0},{1,1},{2,3}
        };
        int[][] walls = {
                {0,1},{2,2},{1,4}
        };
        System.out.println(countUnguarded(m, n, guards, walls));
    }

    static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] arr = new char[m][n];

        for (int[] wall : walls) {
            arr[wall[0]][wall[1]] = 'w';
        }
        for (int[] guard : guards) {
            arr[guard[0]][guard[1]] = 'g';
        }
        for (int[] guard : guards) {
            int x = guard[0], y = guard[1];
            while (x + 1 < m && (arr[x + 1][y] != 'w' && arr[x + 1][y] != 'g')) {
                arr[x + 1][y] = 'm';
                x++;
            }
            x = guard[0];
            y = guard[1];
            while (x - 1 >= 0 && (arr[x - 1][y] != 'w' && arr[x - 1][y] != 'g')) {
                arr[x - 1][y] = 'm';
                x--;
            }
            x = guard[0];
            y = guard[1];
            while (y + 1 < n && (arr[x][y + 1] != 'w' && arr[x][y + 1] != 'g')) {
                arr[x][y + 1] = 'm';
                y++;
            }
            x = guard[0];
            y = guard[1];
            while (y - 1 >= 0 && (arr[x][y - 1] != 'w' && arr[x][y - 1] != 'g')) {
                arr[x][y - 1] = 'm';
                y--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 'w' && arr[i][j] != 'g' && arr[i][j] != 'm') {
                    cnt++;
                }
            }
        }
        return cnt;

    }
}
