package java.easy.q26_removeduplicatesortedarray;

import java.util.ArrayList;

public class solution2_doubleloop {
      public int removeDuplicates(int[] nums) {
        //double loop and check 
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            boolean special = true;
            for(int j = 0; j < unique.size();j++){
                if(nums[i] == unique.get(j)){
                    special = false;
                    break;
                }
            }
            if(special == true){
                unique.add(nums[i]);
            }
        }

        //copy unique values back into the nums
        for(int i = 0; i < unique.size();i++){
            nums[i] = unique.get(i);
        }
        return unique.size(); // return the unique number back
    }
}
