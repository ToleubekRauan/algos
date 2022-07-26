package word_search;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        char[][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABC";

//        char[][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "SEE";

        char[][] arr = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        String word = "AAB";
        System.out.println(exist(arr, word));
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] seen = new boolean[board.length][board[0].length];
                if (helper(board, i, j, word, seen, "").equals(word)) {
                    return true;
                }

            }
        }

        return false;
    }

    private static String helper(char[][] board, int x, int y, String word, boolean[][] seen, String str)  {
        if (word.equals(str)) {
            return str;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || !word.contains(str) || seen[x][y]) {
            return "";
        }
        seen[x][y] = true;
        return helper(board, x + 1, y, word,  seen, str + board[x][y]) +
        helper(board, x - 1, y, word, seen, str + board[x][y]) +
        helper(board, x, y + 1, word,  seen, str + board[x][y]) +
        helper(board, x, y - 1, word,  seen, str + board[x][y]);

    }
}
