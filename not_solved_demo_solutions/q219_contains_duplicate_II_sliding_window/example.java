/*


Code
Testcase
Testcase
Test Result
219. Contains Duplicate II
Easy
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If duplicate exists in current window
            if (window.contains(nums[i])) {
                return true;
            }

            // Add current number
            window.add(nums[i]);

            // Keep window size <= k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}