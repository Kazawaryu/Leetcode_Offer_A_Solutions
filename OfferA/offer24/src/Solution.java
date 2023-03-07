
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        if (head == null) return null;
        ListNode temp;
        while (head.next != null) {
            temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }
        head.next = previous;

        return head;
    }
}