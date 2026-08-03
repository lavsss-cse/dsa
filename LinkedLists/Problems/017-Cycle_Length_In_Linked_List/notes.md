# Problem
Given the head of a linked list. A linked list contains a cycle if its last node is connected to a previous node. If the given list contains a cycle, return the length of the cycle. Otherwise, return 0.

Note: Internally, the driver code uses an integer x to represent the position (1-based indexing) of the node to which the last node is connected. If x = 0, it means last node points to null which indicating there is no loop.

# Test Case
Input: list = [1,2,3,4,5] (cycle at 2)
Output: 4

# Pattern
- List Cycle

# Algorithm
- Start
- Create two pointer nodes slow and fast
- Use while loop to check for loop
- If the loop is found, increment length by 1 and move fast to next position
- Now keep updating length and fast till slow and fast are equal again
- Finally return length
- If there is no cycle found, return 0 outside the loop
- If we keep one pointer fixed at the meeting point and move another pointer one step at a time, it will meet again after length nodes. This is the core logic
- End

# Mistakes made
- return must be inside if, not outside

# Problem Link
https://www.geeksforgeeks.org/problems/find-length-of-loop/1