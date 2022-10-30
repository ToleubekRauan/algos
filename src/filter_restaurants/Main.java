package filter_restaurants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        int[][] rests = {
                {1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}
        };
        int vegan = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        System.out.println(filterRestaurants(rests, vegan, maxPrice, maxDistance));
    }

    static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        List<int[]> list = new ArrayList<>();

        for (int[] rest : restaurants) {
            if ((rest[2] >= veganFriendly) && rest[3] <= maxPrice && rest[4] <= maxDistance) {
                list.add(rest);
            }
        }

        list.sort(Comparator
                .comparing((int[] ints) -> ints[1], (c2,c1) -> c1 - c2)
                .thenComparing((int[] ints) -> ints[0],  (c2,c1) -> c1 - c2));

        return list.stream().map(ints -> ints[0]).collect(Collectors.toList());
    }
}
