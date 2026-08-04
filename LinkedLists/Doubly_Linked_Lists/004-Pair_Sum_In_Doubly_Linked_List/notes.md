# Problem
Given a sorted doubly linked list containing distinct positive integers and an integer target, find all pairs of nodes whose values add up to target.

# Test Case
Input: head = [1,2,4,5,6,8,9], target = 7
Output: [[1,6],[2,5]]

# Pattern
- Doubly Linked List Traversal
- Two Pointers

# Algorithm
- Start
- Create two nodes - first and last - to store the first and last elements of the linked list
(Last can be obtained by traversing till the end)
- Now, use a while loop to run when first and last are not equal, and first.prev is not last.
(It would indicate traversal on both sides as completed)
- Check if the sum of those nodes is equal to target. If yes, add the pair to the list
- If the sum is greater than target, move last
- If the sum is lesser than target, move first
- Finally return the list after completing the loop
- End

# Mistakes made
- update pointer after adding the pair

# Problem Link
https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1