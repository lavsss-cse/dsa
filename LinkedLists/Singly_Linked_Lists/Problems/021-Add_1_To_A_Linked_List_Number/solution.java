/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverse(Node rev){
        Node result = new Node(0);
        Node curr = rev, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        Node dummy = reverse(head);
        Node curr = dummy;
        int carry = 1;
        while(curr != null){
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            if(carry == 0)
                break;
            if(curr.next == null && carry == 1){
                curr.next = new Node(1);
                carry = 0;
                break;
            }
            curr = curr.next;
        }
        return reverse(dummy);
    }
}