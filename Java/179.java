class Solution {
    public String largestNumber(int[] nums) {
        int num,idx;
        String word = "",temp = "";
        for(int i = 0; i < nums.length; i++){
            temp = String.valueOf(nums[i]);
            idx = i;
            for(int j = i + 1; j < nums.length; j++){
                if((String.valueOf(nums[j]) + temp).compareTo(temp + String.valueOf(nums[j])) > 0){
                    temp = String.valueOf(nums[j]);
                    idx = j;
                }
            }
            word += temp;
            num = nums[i];
            nums[i] = nums[idx];
            nums[idx] = num;
        }
        if(word.charAt(0) == '0') return "0";
        return word;
    }
}