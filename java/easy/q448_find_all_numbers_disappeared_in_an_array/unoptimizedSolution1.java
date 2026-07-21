class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<Integer> completeArr = new ArrayList<>();

        HashSet<Integer> arr = new HashSet<>();

        for(int num : nums){
            arr.add(num);
        }

        int length = nums.length;

        for(int i = 1; i <= length; i++){
            completeArr.add(i);
        }

        for(int j : completeArr){
            if(!arr.contains(j)){
                output.add(j);
            }
        }

        return output;
    }
}