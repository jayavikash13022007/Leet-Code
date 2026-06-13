class Solution {
    public int findPeakElement(int[] nums) {
        int mid = 0, left = 0, right = nums.length - 1;
        while(left <= right){
            mid = left + (right - left)/2;
            try{
                if(nums[mid - 1] > nums[mid]){
                    right = mid - 1;
                    continue;
                }
            }
            catch(Exception e){
            }
            try{
                if(nums[mid + 1] > nums[mid]){
                    left = mid + 1;
                    continue;
                }
            }
            catch(Exception e){
            }
            return mid;
        }
        return mid;
    }
}