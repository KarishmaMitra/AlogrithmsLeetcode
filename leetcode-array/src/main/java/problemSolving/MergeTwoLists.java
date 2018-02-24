package problemSolving;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the
 * nodes of the first two lists.
 */
public class MergeTwoLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergeList = mergeLists(l1, l2);

        while (mergeList!=null) {
            if(mergeList.next!=null) {
                System.out.print(mergeList.val + "->");
            } else {
                System.out.print(mergeList.val + "->null");
            }
            mergeList = mergeList.next;
        }
    }

    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head;

        if (l1.val<l2.val) {
            head = new ListNode(l1.val);
            head.next = mergeLists(l1.next, l2);
        } else {
            head = new ListNode(l2.val);
            head.next = mergeLists(l1, l2.next);
        }

        return head;
    }
}
