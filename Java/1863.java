class Solution {
    public int recurse(int[] nums,int xor,int idx){
        if(idx == nums.length) return xor;
        return recurse(nums,xor,idx+1) + recurse(nums,xor^nums[idx],idx+1);
    }
    public int subsetXORSum(int[] nums) {
        return recurse(nums,0,0);
    }
}