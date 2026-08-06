# Where to be used?
A stack is useful whenever you need to answer questions like:
- What was the last thing I added?
- Can I undo the most recent action?
- Do I need to process items in reverse order?
- Do I need to remember previous elements until I find a matching one?

If you think "I only care about the most recent item", a stack is often the right choice.

# Notes
A stack doesn't need to erase values. It only changes where top points.

# Array Implementation
| Operation   | What happens to `top`?                |
| ----------- | ------------------------------------- |
| `push(x)`   | `top` increases by 1, then store `x`  |
| `pop()`     | Read top element, then decrease `top` |
| `peek()`    | Read `array[top]`                     |
| `isEmpty()` | Check if `top == -1`                  |
| `isFull()`  | Check if `top == size - 1`            |

