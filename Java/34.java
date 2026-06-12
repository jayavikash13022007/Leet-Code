class Solution {
    public int[] searchRange(int[] nums, int target) {
        int flag = 0;
        int[] lst = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                lst[0] = i;
                flag++;
                break;
            }
        }
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i]==target){
                lst[1] = i;
                break;
            }
        }
        if(flag == 0){
            lst[0] = -1;
            lst[1] = -1;
        }
        return lst;
    }
}