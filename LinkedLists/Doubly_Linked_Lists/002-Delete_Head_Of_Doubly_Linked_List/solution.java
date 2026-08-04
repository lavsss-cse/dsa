/* Structure of doubly linked list Node
class Node {
public:
    int data;
    Node next;
    Node prev;

    public Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
};*/
class Solution {
    public Node deleteHead(Node head) {
        if(head == null || head.next == null)
            return null;
        Node delete = head.next;
        delete.prev = null;
        head.next = null;
        return delete;
    }
};