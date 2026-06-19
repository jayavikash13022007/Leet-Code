class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> d = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            d.put(nums[i],d.getOrDefault(nums[i],0)+1);
            if(d.get(nums[i]) == 3) return false;
        }
        return true;
    }
}