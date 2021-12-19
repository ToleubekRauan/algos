package all_paths_from_source_to_target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] graph0 = new int[][] {
                {1,2},
                {3},
                {3},
                {}
        };
        int[][] graph = new int[][] {
                {4,3,1},
                {3,2,4},
                {3},
                {4},
                {},
        };
        System.out.println(allPathsSourceTarget(graph));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(0);
        helper(list, inner, graph, 0);
        return list;
    }

    static void helper(List<List<Integer>> outer, List<Integer> inner, int[][] graph, int idx) {

        for (int i = 0; i < graph[idx].length; i++) {
            List<Integer> copy = new ArrayList<>(inner);
            if (graph[idx][i] == graph.length - 1) {
                copy.add(graph[idx][i]);
                outer.add(copy);
            }else {
                copy.add(graph[idx][i]);
                helper(outer, new ArrayList<>(copy), graph, graph[idx][i]);
            }
        }
    }
}
