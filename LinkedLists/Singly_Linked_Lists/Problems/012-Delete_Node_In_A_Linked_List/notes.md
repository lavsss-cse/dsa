# Problem
There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.
Custom testing:
For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.

# Test Case
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]

# Pattern
- Node Updation and Deletion

# Algorithm
- Start
- We are givn only the node to be deleted as the parameter, and not the head.
- So we cannot traverse the linked list from the beginning to find the element before the node to be deleted and update it
- Thus, to remove it, we update the value in the given node as the value in the node next to it, and delete the next node
- This wouldn't lead to NullPointerException in case of last element, as we are clearly said that the given node is not at the end of the list.
- End

# Mistakes made
- NIL, concept and logic understanding is the most important

# Problem Link
https://leetcode.com/problems/delete-node-in-a-linked-list/