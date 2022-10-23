package integer_to_roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }


    static String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        int factor = 1;
        StringBuilder s = new StringBuilder();
        while (num > 0) {
            int last = num % 10;
            if (last == 4 || last == 9) {
                s.append(map.get((last + 1) * factor));
                s.append(map.get(factor));
            }else {
                int remainder = last % 5;
                for (int i = 0; i < remainder; i++) {
                    s.append(map.get(factor));
                }
                if (last > 3 && map.get(5 * factor) != null) {
                    s.append(map.get(5 * factor));
                }

            }
            factor *= 10;
            num /= 10;
        }


        return s.reverse().toString();
    }
}
