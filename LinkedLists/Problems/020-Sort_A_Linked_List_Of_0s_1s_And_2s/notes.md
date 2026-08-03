# Problem
Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.

# Test Case
Input: head = [1,2,2,1,2,0,2,2]
Output: [0,1,1,2,2,2,2,2]

# Pattern
- Pointers
- Value check

# Algorithm
- Start
- Create 6 nodes in total:
  - zero - adding zero consecutively
  - one - adding one consecutively
  - two - adding two consecutively
  - z - head of zero list
  - o - head of one list
  - t - head of two list
- Traverse through the list and update the lists zero, one and two accordingly
- Now, if one list is empty, zero.next connects to two list
- Else connect it to one list
- Connect the one list to two list
- If zero list is not null, return zero list
- Else if one list is not null, return one list
- Else return two list
- End

# Mistakes made
- return values
- concept confusion

# Problem Link
https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1