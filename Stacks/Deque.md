# Deque
- Double ended queue
- Allows to add / remove elements from both ends

dq.addFirst(10);   // add at front
dq.addLast(20);    // add at back
dq.removeFirst();  // remove from front
dq.removeLast();   // remove from back
dq.peekFirst();    // see front
dq.peekLast();     // see back

# Notes
Deque           → data structure
Stack           → data structure
Monotonic Stack → technique/pattern using a stack
Heap            → data structure
Priority Queue  → ADT/way of managing elements by priority

# Working
                DEQUE
                  │
       ┌──────────┴──────────┐
       ↓                     ↓
    FRONT                   BACK
       │                     │
 addFirst()              addLast()
 removeFirst()           removeLast()
 peekFirst()             peekLast()
       ↑
       │
  push/pop/peek
  (stack behavior)