import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int left, right, total;
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            left = i+1;
            right = nums.length-1;
            while(left < right){
                total = nums[i] + nums[left] + nums[right];
                if(total == 0){
                    arr = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    lst.add(arr);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(total < 0) left++;
                else right--;
            }
        }
        return lst;
    }
}