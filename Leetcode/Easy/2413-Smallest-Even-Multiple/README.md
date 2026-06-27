# 2413. Smallest Even Multiple

## Problem
Given a positive integer `n`, return the smallest positive integer that is both a multiple of `n` and an even number.

## Difficulty
Easy

## Approach
- Iterate from `2` to `2 × n`.
- Check whether the current number is divisible by both `2` and `n`.
- Return the first number that satisfies both conditions.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Solution
See `solution.java`.