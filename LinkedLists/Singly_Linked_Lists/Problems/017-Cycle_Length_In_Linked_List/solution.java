/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        int length = 0;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length += 1;
                fast = fast.next;
                while(slow != fast){
                    fast = fast.next;
                    length += 1;
                }
                return length;
            }
        }
        return 0;
    }
}