package cycle_in_graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {2, 3, 4},
                {0},
                {},
                {2, 5},
                {},
        };
        System.out.println(cycleInGraph(arr));
    }

    public static boolean cycleInGraph(int[][] edges) {
        Map<Integer, Boolean> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < edges[0].length; i++) {
            stack.add(edges[0][i]);
        }
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (map.getOrDefault(current, false)) {
                return true;
            }
            map.put(current, true);
            System.out.println("current " + current);
            for (int i = 0; i < edges[current].length; i++) {
                stack.add(edges[current][i]);
            }
        }
        return false;
    }
}
