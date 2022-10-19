package seat_reservation_manager;

import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(10);
        set.add(2);
        set.add(0);

        System.out.println(set);

        System.out.println(set.iterator().next());
    }
}
