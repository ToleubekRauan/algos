package merge_two_sorted_lists;

public class Main {

    public static void main(String[] args) {
        mergeTwoLists(null, null);
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode();
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val >= list2.val) {
            node.val = list2.val;
            node.next = mergeTwoLists(list1, list2 == null ? null : list2.next);
        } else {
            node.val = list1.val;
            node.next = mergeTwoLists(list1 == null ? null : list1.next, list2);
        }


        return node;
    }
}
