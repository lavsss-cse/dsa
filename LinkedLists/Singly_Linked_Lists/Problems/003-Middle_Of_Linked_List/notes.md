# Problem
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

# Test Case
Input: [1,2,3,4,5]
Output: [3,4,5]
Explanation: Return the middlesmost element

# Pattern
- Fast and Slow Pointers

# Algorithm
- Start
- Initialise two pointers slow and fast
- Keep looping until fast reaches the end.
- It is of 2 cases: 
    - n is odd: element after fast reaches null
    - n is even: fast reaches null
- In that case, slow will be the middle element, hence return it
- End

# Analogy
Let A run at 10 m/min and B run at 20 m/min 
Then in 10 minutes, A would have covered 100m and B covers 200m
And hence, A represents the mid value

# Mistakes made
- loop condition confusion

# Problem Link
https://leetcode.com/problems/middle-of-the-linked-list/description/