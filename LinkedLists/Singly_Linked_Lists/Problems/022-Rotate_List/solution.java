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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        if(head == null || head.next == null)
            return head;
        ListNode curr = head, last = head;;
        while(curr != null){
            n += 1;
            if(curr.next == null)
                last = curr;
            curr = curr.next;
        }
        k = k % n;
        if(k == 0)
            return head;
        last.next = head;
        int tail = n - k - 1;
        curr = head;
        for(int i = 0; i < tail; i++)
            curr = curr.next;
        ListNode result = curr.next;
        curr.next = null;
        return result;
    }
}