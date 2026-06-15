class Solution {
    public String makeGood(String s) {
        int flag = 1,i;
        while(flag == 1){
            flag = 0;
            i = 0;
            while(i<s.length()-1){
                if(s.charAt(i)-s.charAt(i+1) == 32 || s.charAt(i+1)-s.charAt(i) == 32){
                    s = s.substring(0,i) + s.substring(i+2);
                    flag = 1;
                }
                else i++;
            }
        }
        return s;
    }
}