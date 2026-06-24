# Head Pointer
If head == null, list is null (i.e.) becomes inaccesible.

# Null Pointer
If current == null, then it indicates end of list

# Traversal
- Start by creating a node current = next
- Update current = current.next until current == null

# Time Complexities
Operation	           Array	Linked List
Access kth element	   O(1)	    O(n)
Search	               O(n)	    O(n)
Insert at beginning	   O(n)	    O(1)
Delete at beginning	   O(n)	    O(1)
Insert at end	       O(1)  	O(n)
Delete at end	       O(1) 	O(n)

NOTE: Random access is not possible as it cannot jump directly, can only be accessed through looping

# Insertion Logic
create - connect - reconnect

# Deletion Logic
removing connections

## Reference Manipulation
process of executing head = head.next, which leads to losing the current head value.
Example:
Suppose list = 1 -> 2 -> 3, head = 1
if head = head.next, then 1 is removed from list, leading to reference manipulation

# Edge Cases
- List is null: head = null
- Single node
- Two nodes
- Last node : current.next = null

