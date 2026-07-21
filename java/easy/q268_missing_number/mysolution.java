/*
268. Missing Number
Solved
Easy
Topics
premium lock icon
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

 


*/



import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {

        int length = nums.length;

        List<Integer> arr = new ArrayList<>();

        // Create [0...n]
        for (int i = 0; i <= length; i++) {
            arr.add(i);
        }

        // Check each candidate
        for (int candidate : arr) {

            boolean found = false;

            for (int num : nums) {

                if (candidate == num) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return candidate;
            }
        }

        return -1;
    }
}