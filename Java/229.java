class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> d = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            try{
                d.put(nums[i],d.get(nums[i])+1);
            }
            catch(Exception e){
                lst.add(nums[i]);
                d.put(nums[i],1);
            }
        }
        for(int i = lst.size()-1; i >= 0; i--){
            if(d.get(lst.get(i)) <= nums.length/3) lst.remove(i);
        }
        return lst;
    }
}