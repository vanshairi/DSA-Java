# Count Digits

## Learning

The number of digits in a positive integer `n` can be calculated using the following formula:

```text
Number of Digits = ⌊log₁₀(n)⌋ + 1
```

### Explanation
- `log₁₀(n)` returns the exponent of the highest power of `10` that is less than or equal to `n`.
- Taking the floor of this value gives the exponent.
- Adding `1` gives the total number of digits.
- The `+1` ensures that numbers which are exact powers of `10` (such as `10`, `100`, `1000`, etc.) return the correct digit count.

> **Note:** This approach is valid only for positive integers (`n > 0`). For `n = 0`, the answer is `1` since `log₁₀(0)` is undefined.