# Problem
Given the head of a doubly linked list, reverse the list and return the head of the reversed doubly linked list.
Note: Driver code will print the returned list in both forward and backward directions.

# Test Case
Input: head = [3,4,5]
Output: [5,4,3]

# Pattern
- Doubly Linked List Reverse

# Algorithm
- Start
- Create a node newNode to store the current head and return after traversal
- While current node is not null, use a temporary node temp to swap positions of left and right
- Repeat this process for all elements in the linked lists
- To move to the next element in a linked list, we usually do curr.next, but since the addresses are swapped, the next node will be at curr.prev.
- End

# Mistakes made
- NIL - concept and logic understanding

# Problem Link
https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1