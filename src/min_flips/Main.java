package min_flips;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println(minFlips(a, b, c));
    }

    public static int minFlips(int a, int b, int c) {
        int answer = 0;

        while (a != 0 | b != 0 | c != 0) {

            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    answer++;
                }
            }else {
                answer += (a & 1) + (b & 1);
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }



        return answer;
    }
}
