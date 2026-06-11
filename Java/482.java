class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String word = "",res = "";
        int n = 0, count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != '-'){
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') word += (char)(s.charAt(i) - 32);
                else word += s.charAt(i);
            }
        }
        n = word.length();
        res = word.substring(0,n%k);
        if(n%k == 0) count = 0;
        else count = k;
        for(int i = n%k; i < n; i++){
            if(count == k){
                res += "-";
                count = 0;
            }
            res += word.charAt(i);
            count++;
        }
        return res;
    }
}