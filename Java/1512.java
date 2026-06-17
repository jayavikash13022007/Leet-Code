class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            try{
                map.put(nums[i],map.get(nums[i])+1);
            }
            catch(Exception e){
                lst.add(nums[i]);
                map.put(nums[i],1);
            }
        }
        for(int i = 0; i < lst.size(); i++){
            if(map.get(lst.get(i)) > 1) count += map.get(lst.get(i)) * (map.get(lst.get(i)) - 1)/2;
        }
        return count;
    }
}