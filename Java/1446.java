class Solution {
    public int maxPower(String s) {
        int max = 0, k = 0,i = 0;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                if(i-k > max) max = i-k;
                k = i;
            }
        }
        if(i-k > max) max = i-k;
        return max;
    }
}