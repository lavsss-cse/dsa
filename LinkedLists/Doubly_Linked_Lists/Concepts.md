# Cheat Sheet
| Operation        | Things that change                         |
| ---------------- | ------------------------------------------ |
| Insert at front  | New node + old head + head                 |
| Insert at end    | New node + old tail (+ tail if maintained) |
| Insert in middle | Previous node + next node + new node       |
| Delete head      | Head + new head                            |
| Delete tail      | Old tail's previous (+ tail if maintained) |
| Delete middle    | Previous node + next node                  |
