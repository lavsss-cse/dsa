# Proof: Why Resetting One Pointer Finds the Start of the Cycle

Let:

- `x` = Distance from the head to the start of the cycle.
- `y` = Distance from the start of the cycle to the meeting point.
- `z` = Remaining distance of the cycle.

Therefore,

- Cycle Length = `y + z`

```
Head ---- x ----> Cycle Start ---- y ----> Meeting Point ---- z ----> Cycle Start
```

## Distances Travelled

When Slow and Fast meet:

- Slow has travelled:

```
x + y
```

- Fast has travelled:

```
x + y + k(y + z)
```

where `k ≥ 1` represents the number of extra complete loops Fast has travelled around the cycle.

Since Fast moves twice as fast as Slow,

```
2(x + y) = x + y + k(y + z)
```

Subtract `(x + y)` from both sides:

```
x + y = k(y + z)
```

Rearranging,

```
x = k(y + z) - y
```

Since,

```
y + z = Cycle Length
```

we can write,

```
x = (k - 1)(Cycle Length) + z
```

## Conclusion

The term

```
(k - 1)(Cycle Length)
```

represents complete laps around the cycle, which do not affect the final position.

Ignoring the complete laps, the remaining distance is simply:

```
z
```

Thus,

- Distance from **Head → Cycle Start** = `x`
- Distance from **Meeting Point → Cycle Start** = `z` (modulo complete cycles)

Therefore, if:

- One pointer starts from the **head**, and
- Another pointer starts from the **meeting point**,

and both move **one step at a time**, they will meet exactly at the **start of the cycle**.