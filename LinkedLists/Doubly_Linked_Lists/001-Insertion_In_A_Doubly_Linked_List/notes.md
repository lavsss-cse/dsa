# Problem
Given the head of a doubly-linked list, a position p, and an integer x. Insert a new node with value x at the position just after pth node (0-based indexing) in the doubly linked list and return the head of the modified list.

# Test Case
Input: head = [2,4,5], p = 2, x = 6
Output: [2,4,5,6]

# Pattern
- Doubly Linked List Insertion

# Algorithm
- Start
- Check for edge case - if the list is empty, return the head
- Create a new node insert with given value x
- Loop till position p using a for loop and a curr node
- Now, curr points to the element at position p and insert must be inserted after curr node.
- Update the conditions:
  - insert.prev = curr
  - insert.next = curr.next
  - curr.next.prev = insert IF curr.next is not the last node
  - curr.prev = insert
- Return head
- End

# Mistakes made
- loop condition
- updating condition - AFTER given position

# Problem Link
https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1