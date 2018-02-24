package problemSolving;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and
 * return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode list = addTwoNumbers(l1, l2);

        while (list!=null) {
            System.out.println(list.val);
            list = list.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1==null) return l2;
        if (l2==null) return l1;

        ListNode list = new ListNode(0);
        ListNode head = list;
        int carry = 0;
        while (l1!=null || l2!=null || carry!=0) {
            int sum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val) + carry;
            carry = sum/10;

            list = list.next = new ListNode(sum%10);

            l1 = l1==null ? l1 : l1.next;
            l2 = l2==null ? l2 : l2.next;
        }
        return (head.val==0) ? (head.next) : (head);
    }
}
