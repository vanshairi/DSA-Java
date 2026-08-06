# Palindrome Number

## Learning

While solving this problem, I learned an optimized approach to check whether a number is a palindrome without reversing the entire number.

1. **Reverse Only Half of the Number**
   - Instead of reversing the complete number, reverse only half of its digits.
   - Continue reversing until `rev >= x`.
   - This reduces unnecessary operations and avoids the risk of integer overflow.

2. **Handling Even and Odd Number of Digits**
   - **Even number of digits:** After reversing half of the digits, the number is a palindrome if `rev == x`.
   - **Odd number of digits:** The middle digit does not affect the palindrome property, so remove it by dividing `rev` by `10`. The number is a palindrome if `rev / 10 == x`.

3. **Special Cases**
   - Negative numbers are never palindromes because of the leading `-` sign.
   - Any non-zero number ending with `0` cannot be a palindrome since a palindrome cannot start with `0`.