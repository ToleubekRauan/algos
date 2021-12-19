package spiral_traverse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7},
        };


        System.out.println(spiralTraverse(arr));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        int startRow = 0, endRow = array.length - 1, startCol = 0,
                endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                list.add(array[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                list.add(array[i][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) break;
                list.add(array[endRow][i]);
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;
                list.add(array[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }

        return list;
    }
}
