# Problem
You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list.

# Test Case
Input: head = [4,5,6]
Output: 457

# Pattern
- Reverse Linked List
- Pointers

# Algorithm
- Start
- Since addition is done from last digit to the first digit, reverse the linked list given
- Now we create a new integer carry to store carry-overs.
- We traverse the reversed linked list and calculate the sum and update the value in that node of the list. We also update carry and if it is zero we stop.
- If the carry is not 1 and the list reaches the end, we create a new node and add the carry over to it.
- Finally, we return the reversed list as we have to undo the reverse done at the beginning.
- End

# Mistakes made
- return values
- carry over
- concept confusion

# Problem Link
https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1