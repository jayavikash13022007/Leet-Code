class Solution {
    public String maximumOddBinaryNumber(String s) {
        int a = -1,b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') a++;
            else b++;
        }
        return "1".repeat(a) + "0".repeat(b) + "1";
    }
}