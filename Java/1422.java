class Solution {
    public int maxScore(String s) {
        int max = 0,left = 0, right = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') right++;
        }
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == '0') left++;
            else right--;
            if(left+right > max) max = left+right;
        }
        return max;
    }
}