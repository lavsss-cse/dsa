# Problem
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

# Test Case
Input: [1,2,2,1]
Output: true

Input: [1,2]
Output: false

# Pattern
- Fast and slow pointers (middle element)
- Pointer reversal (reverse linked list)

# Algorithm
- Start
- Since we cannot go to the previous node in the case of checking from beginning and end using two pointers, we find the middle element of the linked list and then use two pointers to simultaneously check in each half.
- We then reverse the second half of the linked list from the middle element so as to check the palindrome simultaenously.
- We check the list until the middle element is not null
- If at any case the element values are not equal we return false
- Else, return true
- End

# Mistakes made
- reversing linked list
- return element for middle element

# Problem Link
https://leetcode.com/problems/palindrome-linked-list/