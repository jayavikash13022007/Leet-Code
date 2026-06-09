class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                n--;
                for(int j=i;j<n;j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return n;
    }
}