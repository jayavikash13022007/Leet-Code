class Solution {
    public String thousandSeparator(int n) {
        String word = "",m = String.valueOf(n);
        int l = m.length();
        for(int i = 0; i < l; i++){
            word += m.charAt(i);
            if((l-i-1)%3 == 0 && i+1 < l) word += ".";
        }
        return word;
    }
}