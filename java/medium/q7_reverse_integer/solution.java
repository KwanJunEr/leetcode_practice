/*
7. Reverse Integer
Solved
Medium
Topics
premium lock icon
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1


*/

class Solution {
    public int reverse(int x) {
        //123


       String str = Integer.toString(x);

        int sign = 1;

        if (str.charAt(0) == '-') {
            sign = -1;
        }

        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == '-') {
                continue;
            }

            int digit = str.charAt(i) - '0';

            // overflow check
            if (result > Integer.MAX_VALUE / 10 ||
                result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;

        }
        return sign * result; 
    }
}