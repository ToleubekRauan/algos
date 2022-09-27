package partition_labels;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String word = "qiejxqfnqceocmy";
        System.out.println(partitionLabels(word));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();


        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            int lastIdx = s.lastIndexOf(ch);
            for (int j = i + 1 ; j < lastIdx; j++) {
                int index = s.lastIndexOf(s.charAt(j));
                if (index > lastIdx) {
                    lastIdx = Math.max(index, lastIdx);
                }
            }
            list.add(lastIdx - i + 1);
            i = lastIdx + 1;

        }

        return list;
    }
}
