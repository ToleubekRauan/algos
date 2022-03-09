package keys_and_rooms;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(canVisitAllRooms(list));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.addAll(rooms.get(0));

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (visited[num]) {
                continue;
            }else {
                visited[num] = true;
                stack.addAll(rooms.get(num));
            }
        }

        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }
        return true;



    }
}
