package remove_duplicates_from_sorted_list_II;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
        println(node);
    }

    public ListNode deleteDuplicates(ListNode head) {
        return null;
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

    private static void println(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        println(head.next);
    }
}
