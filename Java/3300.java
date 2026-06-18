class Solution {
    public int minElement(int[] nums) {
        int num = Integer.MAX_VALUE,sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            while(nums[i] != 0){
                sum += nums[i]%10;
                nums[i] /= 10;
            }
            num = Math.min(num,sum);
            if(num == 1) return num;
        }
        return num;
    }
}