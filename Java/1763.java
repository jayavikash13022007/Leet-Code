class Solution {
    public boolean niceString(String s){
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                if(s.indexOf(Character.toUpperCase(s.charAt(i))) == -1) return false;
            }
            else{
                if(s.indexOf(Character.toLowerCase(s.charAt(i))) == -1) return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) {
        String max = "";
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(niceString(s.substring(j,i))){
                    if(i-j > max.length()) max = s.substring(j,i);
                }
            }
        }
        return max;
    }
}