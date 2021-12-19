package max_subset_sum_no_adjacent;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {75, 105, 120, 75, 90, 135};
        System.out.println(maxSubsetSumNoAdjacent(arr));
    }


    private static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) return 0;
        int adj = array[0];
        int notAdj = 0;
        for (int i = 1; i < array.length; i++) {
            adj = Math.max(notAdj, adj);
            notAdj += array[i];
            int tmp = adj;
            adj = notAdj;
            notAdj = tmp;

        }
        return Math.max(adj, notAdj);
    }
}
