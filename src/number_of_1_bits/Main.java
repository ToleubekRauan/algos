package number_of_1_bits;

public class Main {

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();
        for (char ch : arr) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }
}
