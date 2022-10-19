package minimize_xor;

public class Main {

    public static void main(String[] args) {
        int num1 = 3123;
        int num2 = 55569;
        System.out.println(minimizeXor2(num1, num2));
    }


    public static int minimizeXor(int num1, int num2) {
        String num2Bin = Integer.toBinaryString(num2);
        int bits = 0;
        for (char ch : num2Bin.toCharArray()) {
            if (ch == '1') bits++;
        }
        String num1Bin = Integer.toBinaryString(num1);
        //10011
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num1Bin.length(); i++) {
            if (num1Bin.charAt(i) == '1' && bits > 0) {
                sb.append("1");
                bits--;
            }else if (num1Bin.charAt(i) == '0') {
                sb.append("0");
            }else if (bits == 0) {
                sb.append("0");
            }
        }
        System.out.println("bits = " + bits);
        //
        if (bits == 0) {
            return Integer.valueOf(sb.toString(), 2);
        }else {
            //1
            StringBuilder reversedSb = sb.reverse();
            int i = 0;
            while (bits > 0) {
                if (i >= sb.length()) {
                    sb.append('1');
                    bits--;
                } else if (reversedSb.charAt(i) == '0') {
                    sb.setCharAt(i, '1');
                    bits--;
                }
                i++;
            }


            return Integer.valueOf(reversedSb.reverse().toString(), 2);
        }
    }


    public static int minimizeXor2(int num1, int num2) {
        int bits = Integer.bitCount(num2);
        int ans = 0;

        for (int i = 31; i >= 0; i--) {
            int cubit = (num1 >> i) & 1;
            if (cubit == 1) {
                ans = ans | 1 << i;
                bits--;
                if (bits == 0) break;

            }
        }

        if (bits > 0) {
            for (int i = 0; i < 32; i++) {
                if (((ans >> i) & 1) == 1) continue;
                ans = ans | 1 << i;
                bits--;
                if (bits == 0) break;
            }
        }



        return ans;
    }



}
