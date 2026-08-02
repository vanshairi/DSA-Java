# Prime Number

## Learning

While solving this problem, I learned an efficient way to determine whether a number is prime.

1. **A Prime Number Has Exactly Two Factors**
   - A prime number has only two factors: `1` and itself.
   - Therefore, count the total number of factors and check whether the count is exactly `2`.

2. **Iterate Only Up to `√n`**
   - It is not necessary to check all numbers up to `n`.
   - Every factor smaller than `√n` has a corresponding factor greater than `√n`.
   - Therefore, iterating only up to `√n` is sufficient, reducing the time complexity.

3. **Count Factor Pairs**
   - If `n % i == 0`, then `i` is a factor.
   - Increment the count for `i`.
   - If `n / i != i`, then the paired factor is different, so increment the count again.
   - This avoids counting perfect square factors twice.

4. **Final Check**
   - If the total number of factors is exactly `2`, the number is prime.
   - Otherwise, it is not a prime number.