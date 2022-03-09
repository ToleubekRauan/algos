package remove_duplicates_from_sorted_list;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
        println(node);
        println(deleteDuplicates(node));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        /*
        1 1 1 2 3 3
        null
         */
        ListNode tmp = head;
        ListNode prev = null;
        while (tmp.next != null) {
            if (tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }
        }
        return prev;
        /*
        1 1 1 2 3 3
        1 1 2 3 3
        1 2 3 3
        1 2 3
         */
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
