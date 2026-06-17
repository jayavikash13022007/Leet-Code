class Solution {
    public int jump(int[] nums) {
        int high = 0,end = 0,jump = 0;
        for(int i = 0; i < nums.length - 1; i++){
            high = Math.max(high,i+nums[i]);
            if(i == end){
                end = high;
                jump++; 
            }
        }
        return jump;
    }
}