package java.medium.q167_twosumII;

public class solution1 {
    public int[] twoSum(int[] numbers, int target) {
        //left to track 
        //right
        //loop conditon to heck 
        int right = numbers.length - 1;
        int left = 0;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right + 1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
       return new int[]{-1, -1};
    }
}
