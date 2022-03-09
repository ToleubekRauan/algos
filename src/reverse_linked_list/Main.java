package reverse_linked_list;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        println(node);
        System.out.println("");
        ListNode reverted = reverseList(node);
        println(reverted);
    }


    private static void println(ListNode node) {
        if (node == null) return;
        System.out.print(node.val + " - ");
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

    public static ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;


        while (curr != null) {
            ListNode copy = curr.next;
            curr.next = prev;
            prev = curr;
            curr = copy;

        }
        return prev;

    }
}
