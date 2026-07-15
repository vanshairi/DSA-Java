# 1672. Richest Customer Wealth

## Problem
Given a 2D integer array `accounts` where `accounts[i][j]` represents the amount of money the `i`<sup>th</sup> customer has in the `j`<sup>th</sup> bank, return the wealth of the richest customer.

## Difficulty
Easy

## Approach
- Traverse each customer's accounts.
- Calculate the total wealth by summing all account balances.
- Keep track of the maximum wealth encountered.
- Return the maximum wealth.

## Time Complexity
O(m × n)

## Space Complexity
O(1)

## Solution
See `solution.java`.