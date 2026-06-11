class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'A') count++;
        }
        for(int i = 0; i < s.length() - 2; i++){
            if(s.substring(i,i+3).equals("LLL")) return false;
        }
        if(count >= 2) return false;
        return true;
    }
}