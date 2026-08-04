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
    private ListNode middle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null)
            return slow;
        else
            return slow.next;
    }
    private ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        ListNode curr = head;
        while(rev != null){
            if(curr.val != rev.val)
                return false;
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }
}