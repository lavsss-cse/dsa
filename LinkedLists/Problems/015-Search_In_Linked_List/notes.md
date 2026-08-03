# Problem
Given a linked list with the head node and a key, the task is to check if the key is present in the linked list or not. Return true if key is present, else return false.

# Test Case
Input: list = [1,2,3,4,5], key = 3
Output: true

Input: list = [1,5,2,9], key = 4
Output: false

# Pattern
- List Traversal and search

# Algorithm
- Start
- While head is not null, check if the value in head equals to the key
- If they are equal, return true
- Keep updating head
- Outside the loop, return false
- End

# Mistakes made
- check for head.data, as the structure has it as data and not val

# Problem Link
https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1