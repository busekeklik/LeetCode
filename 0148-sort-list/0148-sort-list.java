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
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        for(int i = 0; temp!=null; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int i = 0; i < count; i++){
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}