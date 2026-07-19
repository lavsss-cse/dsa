# Problem
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

# Test Case
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7.0.8]
Explanation:
![test case](image.png)

# Pattern
- Dummy Node
- Linked List Creation

# Algorithm
- Start
- Create a new lniked list dummy, and a node tail to point to the start of the linked list and to use for traversal
- Use an integer variable carry to calculate carry over
- Now loop through the list until one of the is not null (i.e.) still has numbers or if the carry is not 0
- Now obtain the element in each of the list in that position, and find the sum by adding it with carry
- Update carry and the sum's last digit (excluding carry) in the created list
- Move the list to the next position when the lists are not null.
- Finally return dummy.next as this pointer is the one which points to the start of the list created.
- End

# Mistakes made
- small corrections

# Problem Link
https://leetcode.com/problems/add-two-numbers/description/