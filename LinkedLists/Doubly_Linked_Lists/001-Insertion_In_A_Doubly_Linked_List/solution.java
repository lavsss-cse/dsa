/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        if(head == null)
            return head;
        Node curr = head;
        Node insert = new Node(x);
        for(int i = 0; i < p; i++)
            curr = curr.next;
        insert.prev = curr;
        insert.next = curr.next;
        if(curr.next != null)
            curr.next.prev = insert;
        curr.next = insert;
        return head;
    }
}