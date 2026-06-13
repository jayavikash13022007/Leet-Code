class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, cur = 0;
        for(int i = 0; i < k; i++) sum += nums[i];
        cur = sum;
        for(int i = 0; i < nums.length-k; i++){
            cur = cur - nums[i] + nums[i+k];
            if(cur > sum) sum = cur;
        }
        return Double.valueOf(sum)/k;
    }
}