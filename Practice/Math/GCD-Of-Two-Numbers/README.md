# Greatest Common Divisor (GCD)

## Learning

While solving this problem, I learned the **Euclidean Algorithm** for finding the Greatest Common Divisor (GCD) of two numbers.

1. **Euclidean Algorithm**
   - Repeatedly subtract the smaller number from the larger number.
   - Continue this process until one of the numbers becomes `0`.
   - The remaining non-zero number is the GCD of the two numbers.

2. **Why It Works**
   - Subtracting the smaller number from the larger one does not change their common divisors.
   - Repeating this process eventually reduces one number to `0`, leaving the greatest common divisor as the other number.

3. **Returning the Result**
   - When the loop ends, one of the numbers is `0` and the other holds the GCD.
   - Returning `Math.max(a, b)` directly returns the non-zero value, making the code shorter and cleaner.