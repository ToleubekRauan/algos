package maximum_sumofan_hourglass;

public class Main {

    public static void main(String[] args) {
        /*
         */
        int[][] grid = {
                {520626,685427,788912,800638,717251,683428},
                {23602,608915,697585,957500,154778,209236},
                {287585,588801,818234,73530,939116,252369},
        };
        System.out.println(maxSum(grid));
    }


    public static int maxSum(int[][] grid) {
        int max = 0;
        /*
        grid[0][0] + grid[0][1] + grid[0][2]    grid[0][3]
        grid[1][0] + grid[1][1] + grid[1][2]
        grid[2][0] + grid[2][1] + grid[2][2]
        */
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                int sum = 0;
                //i = 0 j = 0


                sum += grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                sum += grid[i + 1][j + 1];
                sum += grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];


                max = Math.max(max, sum);

            }
        }

        return max;
    }
}
