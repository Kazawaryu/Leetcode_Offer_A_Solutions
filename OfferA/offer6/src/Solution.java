import java.util.Stack;

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

    public int[] reversePrint(ListNode head) {
        int cnt = 0;
        Stack<Integer> reverse = new Stack<>();

        while (head != null) {
            cnt++;
            reverse.push(head.val);
            head = head.next;
        }

        int[] result = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            result[i] = reverse.pop();
        }


        return result;

    }
}