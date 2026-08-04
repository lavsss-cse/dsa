# Problem
Given the head of a doubly linked list, delete the head node and return the new head of the list.

# Test Case
Input: head = [1,2,3]
Output: [2,3]

# Pattern
- Doubly Linked List Deletion

# Algorithm
- Start
- Check for edge case - if the list is empty or has only one node, return null
- Create a new node delete as head.next
- Update the prev of delete as null, and next of head as null
- Return delete
- End

# Mistakes made
- NIL, concept and logic understanding important

# Problem Link
https://www.geeksforgeeks.org/problems/delete-head-of-doubly-linked-list/1