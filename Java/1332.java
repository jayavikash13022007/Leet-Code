class Solution {
    public int removePalindromeSub(String s) {
        String rev = "";
        for(int i = s.length()-1; i > -1; i--) rev += s.charAt(i);
        if(s.equals(rev)) return 1;
        else return 2;
    }
}