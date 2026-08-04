# Problem
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

# Test Case
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Explanation: Remove all val = 6 and return the list (i.e.) head

# Pattern
- Basics of Linked List
- Deletion of element

# Algorithm
- Start
- Check if the value in head equals val, keep deleting that element till it is equal and head is not null ( update head )
- Initialise a curr node
- While curr is not null, check if the value is equal to the current node val, and keep updating curr's next with the next element's next in that case
- Update curr simultaneously in the outer loop
- Finally, return head
- End

# Mistakes made
- loop condition
- checking base condition - if head element equals val
- return head, not curr : curr points to the end node after iteration

# Problem Link
https://leetcode.com/problems/remove-linked-list-elements/description/