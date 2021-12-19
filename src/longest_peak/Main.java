package longest_peak;

public class Main {

    public static void main(String[] args) {
        //int[] arr = new int[] {1,3,2};
        int[] arr = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(arr));
    }

    public static int longestPeak(int[] array) {
        int ans = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] < array[i + 1] && array[i + 1] > array[i + 2]) {
                int curr = 3;
                int center = i + 1;
                int left = i;
                int right = i + 2;
                while (left >= 1) {
                    if (array[left] > array[left - 1]) {
                        curr++;
                    }else {
                        break;
                    }
                    left--;
                }
                while (right <= array.length - 2) {
                    if (array[right] > array[right + 1]) {
                        curr++;
                    }else {
                        break;
                    }
                    right++;
                }
                ans = Math.max(ans, curr);
            }
        }



        return ans;

    }
}
