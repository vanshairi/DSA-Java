# 342. Power of Four

## Problem
Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

## Difficulty
Easy

## Approach
- Handle the special case where `n` is `0`.
- Repeatedly divide the number by `4`.
- If the number becomes `1`, return `true`.
- If the number is not divisible by `4` at any step, return `false`.

## Time Complexity
O(log₄ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.