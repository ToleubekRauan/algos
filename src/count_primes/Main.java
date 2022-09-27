package count_primes;

public class Main {

    public static void main(String[] args) {
        System.out.println(countPrimes(10_000_000));
    }


    public static int countPrimes(int n) {
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i * i < n; i++) {
            int k = i;
            if (!arr[i]) {
                while (k + i <= n) {
                    k += i;
                    arr[k] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
                count++;
            }
        }
        return count;
    }
}
