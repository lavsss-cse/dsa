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
    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(left != null && right != null){
            if(left.val <= right.val){
                tail.next = left;
                tail = tail.next;
                left = left.next;
            }
            else{
                tail.next = right;
                tail = tail.next;
                right = right.next;
            }
        }
        if(left != null)
            tail.next = left;
        if(right != null)
            tail.next = right;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head, prev = slow;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }
}