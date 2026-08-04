# Problem
Given a doubly linked list of n nodes sorted by values, remove duplicate nodes present in the linked list.

# Test Case
Input: head = [1,1,1,2,3,4]
Output: [1,2,3,4]

# Pattern
- Doubly Linked List Traversal
- Pointers
- Deletion

# Algorithm
- Start
- Create a node curr with value as head
- Traverse through the list till curr is null
- Check if the current element and previous elements are equal when previous elemenet's address is not null
- If yes, store the element next to the curr node in a temporary variable and delete the curr node
- Change curr as the temporary node, as the temporary node can also be a duplicate
- If the elements are not equal, then move curr
- Finally return the head of the list after deletion
(There would be no situation of head getting deleted as we start with the element next to head made possible due to the condition in if statement- curr.prev != null)
- End

# Mistakes made
- dummy node creation and updation

# Problem Link
https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1