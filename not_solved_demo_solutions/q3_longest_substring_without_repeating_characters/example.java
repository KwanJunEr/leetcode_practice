/*
3. Longest Substring Without Repeating Characters
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/


/*
The Sliding Window Idea

Imagine we have two pointers:

        right
          ↓
abcabcbb
↑
left

The area between left and right is our current window.

window = s[left...right]

Our rule:

The window must not contain duplicate characters
How it works
Step 1: Expand the window

Move right forward.

Example:

a

Valid.

Add it.

ab

Valid.

Add it.

abc

Valid.

Update maximum length:

max = 3
Step 2: Duplicate appears

Now:

abca

The character a already exists.

Window is invalid.

So we shrink from the left.

Remove:

a

Move left:

bca

Now valid again.

Why HashSet?

We need to quickly answer:

"Does this window already contain this character?"

HashSet gives:

contains()
add()
remove()

all in approximately:

O(1)
2. Pseudocode
Create a HashSet to store characters in current window

left = 0
right = 0
maxLength = 0


while right is inside string:

    currentCharacter = s[right]


    while currentCharacter already exists in HashSet:

        remove s[left] from HashSet

        move left pointer forward


    add currentCharacter into HashSet


    calculate current window size:

        right - left + 1


    update maxLength


    move right pointer forward


return maxLength
*/



import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        // Store characters inside current window
        HashSet<Character> set = new HashSet<>();

        // Left pointer of sliding window
        int left = 0;

        // Store longest length found
        int maxLength = 0;


        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {


            char current = s.charAt(right);


            /*
             If current character already exists,
             the window has duplicate characters.

             Shrink window from the left
             until duplicate is removed.
            */
            while (set.contains(current)) {

                // Remove leftmost character
                set.remove(s.charAt(left));

                // Move left pointer forward
                left++;
            }


            /*
             Now the window is valid.
             Add current character.
            */
            set.add(current);


            /*
             Window size formula:

             right - left + 1

             Example:

             abc

             left = 0
             right = 2

             size = 2 - 0 + 1
                  = 3
            */
            int windowSize = right - left + 1;


            // Keep the largest window size
            maxLength = Math.max(maxLength, windowSize);
        }


        return maxLength;
    }
}