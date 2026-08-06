# Reverse Integer

## Learning

While solving this problem, I learned the following concepts:

1. **Integer Limits in Java**
   - `Integer.MAX_VALUE` represents the maximum value of a 32-bit signed integer (`2,147,483,647`).
   - `Integer.MIN_VALUE` represents the minimum value of a 32-bit signed integer (`-2,147,483,648`).
   - These constants are useful for detecting integer overflow before it occurs.

2. **Why `>` and `==` Are Used Instead of `>=`**
   - The overflow check is performed **before** appending the next digit.
   - If `rev > Integer.MAX_VALUE / 10`, the next multiplication by `10` will definitely overflow.
   - If `rev == Integer.MAX_VALUE / 10`, overflow depends on the next digit:
     - For positive numbers, only digits **0–7** are valid because `Integer.MAX_VALUE` ends with `7`.
     - For negative numbers, only digits **-8–0** are valid because `Integer.MIN_VALUE` ends with `-8`.
   - Using `>=` or `<=` would incorrectly reject valid cases where the last digit is within the allowed range.