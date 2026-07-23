/*
345. Reverse Vowels of a String
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.


*/


class Solution {
    public String reverseVowels(String s) {
         //IceCreAm
        //I, e, e, A
        // becomes A, e, e, I
        // 
        //Approach 1: 
        /*
        loop through to store into an array containing all the vovlews 
        //Then 
        Another loop to start from the back of the stored array 

        //leetcode 
         //e, e, o, e
         //e, o,e, e
        */
        List<Character> allCharVowels = new ArrayList<>();
        for(char c : s.toCharArray()) {
            if(c == 'a' || c == 'A' || 
               c == 'e' || c == 'E' || 
               c == 'i' || c == 'I' || 
               c == 'o' || c == 'O' || 
               c == 'u' || c == 'U') {

                allCharVowels.add(c);
            }
        }
        int n = allCharVowels.size() - 1;
        char[] charArr = s.toCharArray();

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == 'a' || charArr[i] == 'A' || 
               charArr[i] == 'e' || charArr[i] == 'E' || 
               charArr[i] == 'i' || charArr[i] == 'I' || 
               charArr[i] == 'o' || charArr[i] == 'O' || 
               charArr[i] == 'u' || charArr[i] == 'U'){
                charArr[i] = allCharVowels.get(n);
                n--; 
            }
        }

        return new String(charArr);
        
    
    }
}



