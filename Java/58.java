class Solution {
    public int lengthOfLastWord(String s) {
        int idx = 0,count = 0;
        for(idx = s.length()-1;idx >= 0; idx--){
            if(s.charAt(idx) != ' ') break;
        }
        for(int i = idx;i >= 0 ; i--){
            if(s.charAt(i) == ' ') break;
            count++;
        }
        return count;
    }
}