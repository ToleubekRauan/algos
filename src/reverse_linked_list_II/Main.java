package reverse_linked_list_II;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int left = 3, right = 5;
        println(node);
        println(reverseBetween(node, left, right));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        System.out.println("len = " + len);

        ListNode leftNode = head;
        ListNode rightNode = null;
        ListNode innerNode = null;
        int idx = 1;
        ListNode cur = head;
        while (idx <= len) {
            if (idx == left - 1) {
                leftNode = cur;
                System.out.print("LeftNode = ");
                innerNode = cur.next;
                println(leftNode);
            }else if (idx == right + 1) {
                rightNode = cur;
                System.out.print("RightNode = ");
                println(rightNode);
            }
            cur = cur.next;
            idx++;
        }
        System.out.print("Inner = ");
        println(innerNode);
        ListNode reversed = reverse(innerNode, leftNode, rightNode, left, right);
        System.out.print("reversed = ");
        println(reversed);

        leftNode.next = reversed;
        System.out.print("left + reversed = ");
        println(leftNode);



        return leftNode;
    }

    private static ListNode reverse(ListNode node, ListNode left, ListNode right, int l, int r) {
        ListNode curr = node;
        ListNode prev = right;

        while (curr != null && l <= r) {
            ListNode copy = curr.next;
            curr.next = prev;
            prev = curr;
            curr = copy;
            l++;
        }
        return prev;
    }


    private static void println(ListNode node) {
        if (node == null) {
            System.out.println();
            return;
        }
        if (node.next == null) {
            System.out.print(node.val);
        }else {
            System.out.print(node.val + "-");
        }
        println(node.next);


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
