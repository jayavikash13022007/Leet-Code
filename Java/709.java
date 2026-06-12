class Solution {
    public String toLowerCase(String s) {
        String a = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') a += (char)(s.charAt(i)+32);
            else a += s.charAt(i);
        }
        return a;
    }
}