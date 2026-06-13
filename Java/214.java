class Solution {
    public String shortestPalindrome(String s) {
        String rev = "", temp = "";
        int left = 0,right = 0;
        for(right = s.length() - 1; right > -1; right--){
            if(s.charAt(left) == s.charAt(right)) left++;
        }
        if(left == s.length()) return s;
        temp = s.substring(left);
        for(int i = temp.length() - 1; i > -1; i--) rev += temp.charAt(i);
        return rev + shortestPalindrome(s.substring(0,left)) + temp;
    }
}