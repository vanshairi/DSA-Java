# 3099. Harshad Number

## Problem
Given an integer `x`, return the sum of its digits if `x` is a Harshad number. Otherwise, return `-1`.

## Difficulty
Easy

## Approach
- Store the original value of the number.
- Calculate the sum of its digits.
- Check if the original number is divisible by the sum of its digits.
- Return the sum if it is divisible; otherwise, return `-1`.

## Time Complexity
O(log₁₀ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.
```