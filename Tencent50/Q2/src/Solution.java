/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = l1.val + l2.val;
        l1 = l1.next;
        l2 = l2.next;
        ListNode head = new ListNode(num % 10);
        ListNode temp = head;
        int up = num / 10;
        ListNode thisTemp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                num = up + l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                num = up + l1.val;
                l1 = l1.next;
            } else {
                num = up + l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            up = num / 10;
            thisTemp = new ListNode(num % 10);
            temp.next = thisTemp;
            temp = temp.next;
        }

        if (up != 0){
            thisTemp = new ListNode(up);
            temp.next = thisTemp;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}