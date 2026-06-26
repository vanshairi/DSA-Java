# 258. Add Digits

## Problem
Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

## Difficulty
Easy

## Approach
- Keep summing the digits of the number until it becomes a single-digit number.
- Use an inner loop to calculate the sum of the digits.
- Replace the original number with the computed sum.
- Repeat the process until `num < 10`.

## Time Complexity
O(log₁₀ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.