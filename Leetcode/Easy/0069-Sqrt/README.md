# 69. Sqrt(x)

## Problem
Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. You must not use any built-in exponent function or operator.

## Difficulty
Easy

## Approach
- Start from `0` and increment the number one by one.
- Continue while the square of the current number is less than or equal to `x`.
- Use `long` while multiplying to prevent integer overflow.
- Return the previous number, as it is the largest integer whose square does not exceed `x`.

## Time Complexity
O(√x)

## Space Complexity
O(1)

## Solution
See `bruteforce.java`.