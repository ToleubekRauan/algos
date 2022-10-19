package mergesort;

public class Main {

    public static void main(String[] args) {
        //    12 8
        /*
        1 3 7 8 10 15      2 4 5 12 17 23
         */
    }

    void merge(int[] arr, int l, int r, int m) {
        int[] A1 = new int[m - l + 1];
        int[] A2 = new int[r - m];

        for (int i = 0; i < m; i++) {
            A1[i] = arr[i];
        }


    }
}
