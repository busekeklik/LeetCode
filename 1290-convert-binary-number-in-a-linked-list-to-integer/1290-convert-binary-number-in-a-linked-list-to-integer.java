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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder str= new StringBuilder();
        
        while(temp != null){
            str.append(temp.val);
            temp=temp.next;
        }
        int res = Integer.parseInt(str.toString(),2);
        return res;
    }
}