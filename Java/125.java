class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        String rev = "";
        char a;
        for(int i=0;i<s.length();i++){
            a = s.charAt(i);
            if((a>='a' && a<='z') || (a>='0' && a<='9')){
                str += a;
            }
            else{
                if(a>='A' && a<='Z'){
                    str += (char)(a+32);
                }
            }
        }
        for(int i=str.length()-1;i>-1;i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
}