# Basics
- Monotonically increasing stack - values increase as we go from top to bottom
- Monotonically decreasing stack - values decrease as we go from top to bottom

# Important idea
- We deliberately remove elements from the stack when they violate our desired order.
- Push/pop -> maintain an order -> remove elements that can never be useful again
- if stack top violates our desired order
    pop
  else
    push
    