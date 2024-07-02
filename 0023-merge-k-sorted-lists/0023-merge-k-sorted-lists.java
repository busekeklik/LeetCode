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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                nums.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(nums);
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        for (int val : nums) {
            tmp.next = new ListNode(val);
            tmp = tmp.next;
        }
        return res.next;
    }
}