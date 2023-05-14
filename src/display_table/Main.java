package display_table;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<String>> orders = new ArrayList<>();

        orders.add(Arrays.asList("James","12","Fried Chicken"));
        orders.add(Arrays.asList("Ratesh","12","Fried Chicken"));
        orders.add(Arrays.asList("Amadeus","12","Fried Chicken"));
        orders.add(Arrays.asList("Adam","1","Canadian Waffles"));
        orders.add(Arrays.asList("Brianna","1","Canadian Waffles"));

        System.out.println(displayTable(orders));

    }

    public static List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> foods = new TreeSet<>(Comparator.naturalOrder());
        Set<String> tableSet = new TreeSet<>((a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        Map<String, List<String>> map = new HashMap<>();

        for (List<String> order : orders) {
            tableSet.add(order.get(1));
            foods.add(order.get(2));
            List<String> list = map.getOrDefault(order.get(1), new ArrayList<>());
            list.add(order.get(2));
            map.put(order.get(1), list);
        }



        List<List<String>> table = new ArrayList<>();

        generateFirstRow(foods, table);

        for (String key : tableSet) {
            List<String> value = map.get(key);
            List<String> row = new ArrayList<>();
            row.add(key);
            for (String food : foods) {
                int count = 0;
                for (String item: value) {
                    if (food.equals(item)) {
                        count++;
                    }
                }
                row.add(String.valueOf(count));
            }
            table.add(row);
        }



        return table;
    }

    private static void generateFirstRow(Set<String> foods, List<List<String>> table) {
        List<String> firstRow = new ArrayList<>();
        firstRow.add("Table");
        firstRow.addAll(foods);
        table.add(firstRow);
    }
}
