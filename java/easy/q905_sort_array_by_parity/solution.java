/*


*/


//Mistake not thinking about moving the pointers

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int right = nums.length - 1;
        int left = 0; 
        if(nums.length == 1){
            return nums;
        }
         while(left < right){
             if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        
         }
         return nums; 
    }
}