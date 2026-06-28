# 231. Power of Two

## Problem
Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

## Difficulty
Easy

## Approach
- Handle the special case where `n` is `0`.
- Repeatedly divide the number by `2`.
- If the number becomes `1`, return `true`.
- If an odd number (other than `1`) is encountered, return `false`.

## Time Complexity
O(log₂ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.