/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node first = head, last = head;
        while(last.next != null)
            last = last.next;
        while(first != last && first.prev != last){
            int sum = first.data + last.data;
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(first.data);
                pair.add(last.data);
                result.add(pair);
                first = first.next;
                last = last.prev;
            }
            else if(sum > target)
                last = last.prev;
            else
                first = first.next;
        }
        return result;
    }
}