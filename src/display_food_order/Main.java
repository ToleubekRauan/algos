package display_food_order;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("David","3","Ceviche"));
        list.add(Arrays.asList("Corina","10","Beef Burrito"));
        list.add(Arrays.asList("David","3","Fried Chicken"));
        list.add(Arrays.asList("Carla","5","Water"));
        list.add(Arrays.asList("Carla","5","Ceviche"));
        list.add(Arrays.asList("Rous","3","Ceviche"));
        System.out.println(displayTable(list));
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(Comparator.comparing((Map.Entry<String, Integer> e) -> e.getValue(), (e1, e2) -> e2 - e1)
                .thenComparing((Map.Entry<String, Integer> e) -> e.getKey(), Comparator.reverseOrder()));

        Map<String, Integer> map = new HashMap<>();
        pq.addAll(map.entrySet());

        List<String> strs = new ArrayList<>();
        Collections.sort(strs, Comparator.reverseOrder());

    }

    static List<List<String>> displayTable(List<List<String>> orders) {

        List<List<String>> out = new ArrayList<>();
        Map<Integer, Map<String, Integer>> map = new HashMap<>();

        List<String> foods = new ArrayList<>();
        for (List<String> order : orders) {
            foods.add(order.get(2));
        }
        /*

        david 3 ceviche
        corina 10 beef
        david 3 fried chicken
        carla 5 water
        carla 5 ceviche
        rouse 3 ceviche

        3 - cev
        3 - fried chicken
        */
        List<String> first = new ArrayList<>();
        first.add("Table");
        Collections.sort(foods);
        first.addAll(foods);


        out.add(first);
        return out;
    }

}
