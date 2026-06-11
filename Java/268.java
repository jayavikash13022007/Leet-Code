import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            lst.add(nums[i]);
        }
        for(int i = 0;i<=nums.length;i++){
            if(!lst.contains(i)) return i;
        }
        return nums.length;
    }
}