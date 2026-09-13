# Problem
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

# Test Case
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]

# Pattern
- Monotonic Stack

# Algorithm
- Start
- Create an stack and a hashmap to store next greater elements for each element.
- As we need the next greater element, we loop from the right of nums2.
- Keep removing elements from the stack, while the stack is not empty and the top element of the stack is less than or equal to the current element in nums2.
- Once removed, check if the stack is empty.
- If the stack is empty, there is no next greater element for that particular value. So add it to hashmap with value -1.
- Else, add the particular element, and the topmost element in the stack as it would be the next greater element.
- Push the current element in the stack to check for remaining elements of nums2.
- Finally, loop through the array nums1, add its correspodning value to a new array arr and return arr
- End

# Mistakes made
- loop statement

# Problem Link
https://leetcode.com/problems/next-greater-element-i/description/