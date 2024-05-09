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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head.next;
        ListNode prev = head;

        while(current != null) {
            ListNode temp = new ListNode(gcd(current.val, prev.val),current);
            prev.next = temp;
            prev = current;
            current = current.next;
        }
        return head;
    }


    private int gcd(int a, int b) {
        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}

