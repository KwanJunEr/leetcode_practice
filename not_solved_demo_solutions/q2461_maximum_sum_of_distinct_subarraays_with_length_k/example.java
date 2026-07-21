/*

2461. Maximum Sum of Distinct Subarrays With Length K
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
Example 2:

Input: nums = [4,4,4], k = 3
Output: 0
Explanation: The subarrays of nums with length 3 are:
- [4,4,4] which does not meet the requirements because the element 4 is repeated.
We return 0 because no subarrays meet the conditions.
 

*/


mport java.util.*;

class Solution {

    public long maximumSubarraySum(int[] nums, int k) {


        // Store elements inside current window
        HashSet<Integer> set = new HashSet<>();


        // Left pointer
        int left = 0;


        // Current window sum
        long currentSum = 0;


        // Answer
        long maxSum = 0;



        // Expand right pointer
        for (int right = 0; right < nums.length; right++) {


            // Add current element into window
            set.add(nums[right]);


            // Add current element to sum
            currentSum += nums[right];



            /*
             Maintain fixed window size k

             If window becomes bigger than k,
             remove the left element
            */
            if (right - left + 1 > k) {


                // Remove left element from set
                set.remove(nums[left]);


                // Remove left element from sum
                currentSum -= nums[left];


                // Move left pointer
                left++;
            }



            /*
             Now window size is exactly k

             Check if every element is unique

             Example:

             [1,5,4]

             set size = 3
             k = 3

             Valid
            */
            if (right - left + 1 == k &&
                set.size() == k) {


                maxSum = Math.max(maxSum, currentSum);
            }

        }


        return maxSum;
    }
}