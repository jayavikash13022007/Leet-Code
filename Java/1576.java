class Solution {
    public String modifyString(String s) {
        int val;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '?'){
                try{
                    val = 97;
                    while(true){
                        s = s.substring(0,i) + (char)val + s.substring(i+1);
                        if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i+1)) break;
                        val++;
                    }
                }
                catch(Exception e){
                    if(s.length()>1){
                        if(i==0){
                            if(s.charAt(i+1) != '?') s = (char)((s.charAt(i+1)-96)%26 + 97) + s.substring(i+1);
                            else s = "a" + s.substring(i+1);
                        }
                        else s = s.substring(0,i) + (char)((s.charAt(i-1)-96)%26 + 97);
                    }
                    else s = "a";
                }
            }
        }
        return s;
    }
}