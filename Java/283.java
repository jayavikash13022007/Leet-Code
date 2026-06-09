class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0;
        int n = nums.length;
        for(int i=0;i<n-z;i++){
            if(nums[i]==0){
                z++;
                for(int j=i;j<n-z;j++){
                    nums[j] = nums[j+1];
                }
                nums[n-z] = 0;
                i--;
            }
        }
    }
}