/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        Node curr = headRef, dummy = null;
        while(curr != null){
            if(curr.prev != null && curr.data == curr.prev.data){
                Node next = curr.next;
                curr.prev.next = curr.next;
                if(curr.next != null)
                    curr.next.prev = curr.prev;
                dummy = curr.next;
                curr.prev = null;
                curr.next = null;
                curr = next;
            }
            else
                curr = curr.next;
        }
        return headRef;
    }
}