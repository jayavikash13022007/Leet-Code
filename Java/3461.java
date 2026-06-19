class Solution {
    public boolean hasSameDigits(String s) {
        String word = "";
        while(s.length() > 2){
            for(int i = 0; i < s.length()-1; i++) word += (char)(((s.charAt(i)+s.charAt(i+1)-96)%10)+48);
            s = word;
            word = "";
        }
        return s.charAt(0)==s.charAt(1);
    }
}