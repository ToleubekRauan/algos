package bitwise_and_on_ranfe;

public class Main {

    public static void main(String[] args) {
        int left = 2;
        int right = 3;
        System.out.println("result = " + rangeBitwiseAnd(left, right));
    }

    public static int rangeBitwiseAnd(int left, int right) {
        if (left == 0) {
            return left;
        }
        if (left == right) {
            return left;
        }
        int length = right - left + 1;
        StringBuilder sb = new StringBuilder();

        int exp = 1;
        while (left > 0) {
            if ((left & 1) == 0) {
                sb.insert(0, "0");
            }else {
              if (length <= exp && ((right & 1) == 1)) {
                  sb.insert(0, "1");
              }else {
                  sb.insert(0, "0");
              }
            }
            exp *= 2;
            left >>= 1;
            right >>= 1;
        }
        return Integer.valueOf(sb.toString(), 2);

        /*
        00000 0
        00001 1


        00010 2
        00011 3

        00100 4
        00101 5
        00110 6
        00111 7
        01000 8
        01001 9
        01010 10
        01011 11
        01100 12
        01101 13
        01110 14
        01111 15

        10000
        10001
        10010
        10011
        10100
        10101
        10110
        10111
        11000
        11001
        11010
        11011
        11100
        11101
        11110
        11111
        */

    }
}

