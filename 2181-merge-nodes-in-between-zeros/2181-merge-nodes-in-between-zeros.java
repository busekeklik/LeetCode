/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int sum = 0;

        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                sum += head.val;
            } else if (sum > 0) {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            head = head.next;
        }
        return res.next;
    }
}