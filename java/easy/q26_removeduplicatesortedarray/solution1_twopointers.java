package java.easy.q26_removeduplicatesortedarray;

public class solution1_twopointers {
     public int removeDuplicates(int[] array){
        int lastuniquearrayindex = 0; //help keep track of the index to manipulate the original array
        for(int j = 1; j < array.length; j++){
            if(array[lastuniquearrayindex] != array[j]){
                lastuniquearrayindex++;
                array[lastuniquearrayindex] = array[j];
            }
        }
        return lastuniquearrayindex + 1;
    }
}
