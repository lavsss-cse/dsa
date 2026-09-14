# Problem
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

# Test Case
Input: nums1 = [1,2,1]
Output: [2,-1,2]

# Pattern
- Monotonic Stack

# Algorithm
- Start
- Create an stack to store index of elements whose greater elements are not found yet, and an resultant array filled with -1 by default.
- Now loop through the given array for 2x times as it is circularly checked.
- Calculate the index of the element by performing modulo division on i and n
- Keep updating result array and removing from the stack, until the stack is not empty and the topmost element is less than the current element.
- If the index is equal to i, then push that element to stack as we should not repeat elements in stack.
- Finally return the resultant array.
- End

# Mistakes made
- nothing much - be thorough with concepts

# Problem Link
https://leetcode.com/problems/next-greater-element-ii/description/