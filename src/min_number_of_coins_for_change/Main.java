package min_number_of_coins_for_change;

public class Main {

    public static void main(String[] args) {

    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] arr = new int[n];
        int ans = 0;
        int i = 0;
        int sum = 0;
        int len = denoms.length - 1;
        while (len >= 0) {
            while (sum < n) {
                sum += denoms[len];
                ans++;
                if (sum == n) {
                    return ans;
                }
            }
            if (sum > n) {
                sum -= denoms[len];
                ans--;
            }
            len--;
        }

        return ans;
    }
}
