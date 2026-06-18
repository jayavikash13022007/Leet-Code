class Solution {
    public int countPartitions(int[] nums) {
        int count = 0, left = 0, right = 0;
        for(int i = 0; i < nums.length; i++) right += nums[i];
        for(int i = 0; i < nums.length-1; i++){
            left += nums[i];
            right -= nums[i];
            if(Math.abs(left-right)%2 == 0) count++;
        }
        return count;
    }
}