/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        Node zero = new Node(0);
        Node one = new Node(0);
        Node two = new Node(0);
        Node z = zero, o = one, t = two;
        while(head != null){
            if(head.data == 0){
                zero.next = head;
                zero = zero.next;
            }
            else if(head.data == 1){
                one.next = head;
                one = one.next;
            }
            else{
                two.next = head;
                two = two.next;
            }
            head = head.next;
        }
        if(o.next == null)
            zero.next = t.next;
        else
            zero.next = o.next;
        one.next = t.next;
        two.next = null;
        if(z.next != null)
            return z.next;
        else if(o.next != null)
            return o.next;
        else
            return t.next;
    }
}