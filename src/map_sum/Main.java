package map_sum;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        System.out.println(mapSum.sum("ap"));;
        mapSum.insert("app", 2);
        mapSum.insert("apple", 2);
        System.out.println(mapSum.sum("ap"));;
    }

    static class MapSum {

        private Node root;

        public MapSum() {
            this.root = new Node();
        }

        public void insert(String key, int val) {
            Node n = root;
            for (char ch : key.toCharArray()) {
                if (n.children[ch - 'a'] == null) {
                    Node t = new Node();
                    n.children[ch - 'a'] = t;
                }
                n = n.children[ch - 'a'];
            }
            n.val = val;
            n.isFinished = true;

        }

        public int sum(String prefix) {
            Node n = root;
            for (char ch : prefix.toCharArray()) {
                if (n.children[ch - 'a'] != null) {
                    n = n.children[ch - 'a'];
                }else {
                    return 0;
                }
            }
            Queue<Node> q = new LinkedList<>();
            q.add(n);
            int sum = 0;
            while (!q.isEmpty()) {
                Node ch = q.poll();
                if (ch != null) {
                    if (ch.isFinished) {
                        sum += ch.val;
                    }
                    for (Node no : ch.children) {
                        if (no != null) {
                            q.add(no);
                        }
                    }
                }
            }

            return sum;
        }

        class Node {


            Node[] children = new Node[26];
            boolean isFinished = false;
            int val = 0;

        }
    }

}
