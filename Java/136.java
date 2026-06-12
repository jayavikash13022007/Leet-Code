import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> d = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            try{
                d.put(nums[i],d.get(nums[i]) + 1);
            }
            catch(Exception e){
                d.put(nums[i],1);
                lst.add(nums[i]);
            }
        }
        for(int i = 0; i < lst.size(); i++){
            if(d.get(lst.get(i)) == 1) return lst.get(i);
        }
        return lst.get(lst.size()-1);
    }
}