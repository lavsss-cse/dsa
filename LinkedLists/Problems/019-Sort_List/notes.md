# Problem
Given the head of a linked list, return the list after sorting it in ascending order.

# Test Case
Input: head = [4,2,1,3]
Output: [1,2,3,4]

# Pattern
- Merge two sorted list
- Middle element
- Pointers

# Algorithm
- Start
- Edge cases - if there are no or 1 element return it
- Now loop through the array to find the middle element and also a prev pointer to stop in the middle element as slow and fast method points to the element after the middle element
- We are doing this to recursively split the linked list and perform merge sort
- After finding the middle element (i.e.) prev, split the list into two halves by making prev.next as null
- Now there are two linked lists - head and slow
- Sort this induvidually by recursively calling sortList(node) function
- Store it in two separate nodes - left and right
- Now merge these two sorted linked lists left and right (Problem 006)
- Return the head of this sorted linked list
- End

# Mistakes made
- return values
- merge two sorted lists
- recursion understanding

# Problem Link
https://leetcode.com/problems/sort-list/description/