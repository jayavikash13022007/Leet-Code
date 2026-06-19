import java.util.*;
class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] lst = new int[51];
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i <= nums.length-k; i++){
            for(int j = i; j < i+k; j++) s.add(nums[j]);
            for(int num: s) lst[num]++;
            s.clear();
        }
        for(int i = 50; i >= 0; i--){
            if(lst[i] == 1) return i;
        }
        return -1;
    }
}