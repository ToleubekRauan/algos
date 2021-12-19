package merge_overlap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] arr2 = new int[][]{
                {1, 10},
                {10, 20},
                {20, 30},
                {30, 40},
                {40, 50},
                {50, 60},
                {60, 70},
                {70, 80},
                {80, 90},
                {90, 100}
        };
        int[][] arr3 = new int[][] {
                {-50, 0},
                {-10, 20},
                {70, 90},
                {89, 90},
                {90, 91},
                {90, 95}
        };
        int[][] arr4 = new int[][] {
                {1, 10},
                {2, 3},
                {4, 5},
                {6, 7},
                {8, 9},
        };
        int[][] arr = new int[][] {
                {1, 2},
                {3, 8},
                {9, 10}
        };

        int[][] arr5 = new int[][] {
                {-50, 0},
                {-10, 20},
                {70, 90},
                {89, 90},
                {90, 91},
                {90, 95}
        };

        int[][] arr6 = new int[][] {
                {1, 104},
                {100, 105},
        };

        int[][] arr7 = new int[][] {
                {1, 2},
                {3, 7},
                {6, 8},
                {9, 10}
        };

        int[][] arr8 = new int[][] {
                {1, 2},
                {3, 5},
                {4, 7},
                {6, 8},
                {9, 10}
        };
        System.out.println(Arrays.deepToString(mergeOverlappingIntervals(arr8)));
    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        /*
		1 2 -  3 5 - 4 7 - 6 8 - 9 10
		*/
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int nextStart = 0;
        int nextEnd = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];


        for (int i = 1; i < intervals.length; i++) {
            nextStart = intervals[i][0];
            nextEnd = intervals[i][1];

            if (nextStart > currentEnd) {
                list.add(new int[] {currentStart, currentEnd});
                currentStart = nextStart;
                currentEnd = nextEnd;
            }else {
                currentEnd = Math.max(nextEnd, currentEnd);
            }
        }

        list.add(new int[] {currentStart, currentEnd});



        return list.toArray(new int[list.size()][]);
    }



}
