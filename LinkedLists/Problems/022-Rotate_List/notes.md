# Problem
Given the head of a linked list, rotate the list to the right by k places.

# Test Case
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

# Pattern
- Reverse Linked List
- Pointers

# Algorithm
- Start
- We first calculate the length of the linked list to reduce the number of rotations in case of k > n.
- We simultaneously find the last node and connect it with the head to form a cycle.
- Now, we calculate the position of the last node and find it using for loop.
- Once it is found, we identify the element next to it. This element will be returned as it will be the head of the rotated list.
- The cycle is broken by making the tail element's next as null as the tail element would be at the end of the list.
- End

# Mistakes made
- edge cases
- direct algorithm

# Problem Link
https://leetcode.com/problems/rotate-list/