class Solution {
    public int loop(int i,int[] nums){
        for(int j = i+1; j < nums.length; j++){
            if(nums[j] > nums[i]) return nums[j];
        }
        for(int j = 0; j < i; j++){
            if(nums[j] > nums[i]) return nums[j];
        }
        return -1;
    }
    public int[] nextGreaterElements(int[] nums) {
        int[] lst = new int[nums.length];
        for(int i = 0; i < nums.length; i++) lst[i] = loop(i,nums);
        return lst;
    }
}