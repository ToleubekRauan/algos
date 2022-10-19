package prefix_func;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //aaaaa
        System.out.println(prefixFunc("aaaaa"));
    }

    static List<Integer> prefixFunc(String s) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int size = s.length();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (s.substring(0, j).equals(s.substring(i - j + 1, j + 1))) {
                    list.add(j);
                }
            }
        }

        return list;
    }
}
