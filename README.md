# Find-the-Pair-with-a-Given-Sum
Given an array of integers nums and a target sum target, your task is to find a pair of numbers in the array that add up to the target sum. If such a pair exists, return their indices; otherwise, return [-1, -1].
Explanation:
HashMap Usage:

The HashMap stores the current number as the key and its index as the value.
For every number in the array, the complement (target - nums[i]) is checked in the HashMap.
If found, the indices of the current number and its complement are returned.
Efficient Solution:

This solution ensures O(n) time complexity as the HashMap operations (insert and lookup) take O(1) on average.
Edge Case:

If no pair is found, the method returns [-1, -1].
