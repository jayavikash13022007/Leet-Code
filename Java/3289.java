class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] lst = new int[nums.length-2];
        int[] arr = new int[2];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            lst[nums[i]]++;
            if(lst[nums[i]] == 2){
                arr[idx++] = nums[i];
                if(idx == 2) return arr;
            }
        }
        return arr;
    }
}