package problemSolving;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */

public class SwapInPairs {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode res = swapInPairs(head);

        while (res!=null) {
            if (res.next!=null) {
                System.out.print(res.val + "->");
            } else {
                System.out.print(res.val);
            }
            res = res.next;
        }
    }

    public static ListNode swapInPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode node =  head.next;
        head.next = swapInPairs(head.next.next);
        node.next = head;
        return node;
    }
}
