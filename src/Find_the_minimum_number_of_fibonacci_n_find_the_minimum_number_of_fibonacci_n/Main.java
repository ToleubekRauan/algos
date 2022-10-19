package Find_the_minimum_number_of_fibonacci_n_find_the_minimum_number_of_fibonacci_n;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(answer(513314));

    }

    static int answer(int input) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int n = input, firstTerm = 0, secondTerm = 1;


        while (firstTerm <= n) {
            list.add(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        int cnt = 0;

        int sum = 0;

        int idx = list.size() - 1;

        while (sum != input) {
            //sum += 5
            if (sum + list.get(idx) <= input) {
                sum += list.get(idx);
                cnt++;
            }else {
                idx--;
            }
        }


        return cnt;
    }


}
