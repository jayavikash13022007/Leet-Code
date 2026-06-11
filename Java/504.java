class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        String b = "",a = "";
        if(num < 0){
            b = "-";
            num *= -1;
        }
        while(num != 0){
            a = (char)(num%7 + '0') + a;
            num /= 7;
        }
        return b+a;
    }
}