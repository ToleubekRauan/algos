package minimum_number_of_vertices_to_reach_all_nodes;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0,1));
        list.add(Arrays.asList(0,2));
        list.add(Arrays.asList(2,5));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(4,2));
        System.out.println(findSmallestSetOfVertices(n, list));
    }

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        //List<Integer> list = new ArrayList<>();
        SortedSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < edges.size(); i++) {
            if (set.contains(edges.get(i).get(0))) continue;
            boolean exist = false;
            for (int j = 0; j < edges.size(); j++) {
                if (i == j) continue;
                if (edges.get(i).get(0) == edges.get(j).get(1)) {
                    exist = true;
                }
            }
            if (!exist) {
                set.add(edges.get(i).get(0));
            }
        }



        return new ArrayList<Integer>(set);
    }
}
