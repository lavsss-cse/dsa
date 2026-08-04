# Problem
Given the head of a singly linked list, reverse the list, and return the reversed list.

# Test Case
Input: [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: Reverse the list and return it

# Pattern
- Pointer Reversal

# Algorithm
- Start
- Initialise 3 variables:
    - curr : current node, to track the node which should be updated
    - prev : previous node, to update the curr node after reversing
    - next : next node, to update the curr node's next address pointed
- Use a while loop to loop through the list until curr node is null
- First, find the next node for curr
- Next, update curr's next address to prev node's address
- Now update prev node as curr
- Finally, update curr
- Noww, after looping, the list would be reversed and the prev node points to the head of the linked list now. 
(In case of confusion, dry run is given below)
- Thus, return prev
- End

# Mistakes made
- reversing conditions
- return node

# Dry Run
Input: [1,2,3]
Output: [3,2,1]
Explanation:
- Initialisation: curr = 1, prev = null, next = head
- Loop 1: next = 2, curr = 2, prev = 1
- Loop 2: next = 3, curr = 3, prev = 2
- Loop 3: next = null, curr = null, prev = 3

# Problem Link
https://leetcode.com/problems/reverse-linked-list/description/