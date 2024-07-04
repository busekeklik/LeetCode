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
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList();
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = nums.size() - 1;
         while(left < right) {
            if (nums.get(left) == nums.get(right)){
                left++;
                right--;
                continue;
            }
            else
                return false;
            
        }
        return true;
    }
}