class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int idx, min;
        for(int i = 0; i < k; i++){
            idx = 0;
            min = nums[0];
            for(int j = 1; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] *= multiplier;
        }
        return nums;
    }
}