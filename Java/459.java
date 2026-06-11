class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String word;
        int n = 0,count = 0,i = 0,j = 0;
        for(i=1;i<s.length()/2+1;i++){
            if(s.substring(0,i).equals(s.substring(i,2*i))){
                word = s.substring(0,i);
                n = word.length();
                if(s.length()%n != 0) continue;
                count = 0;
                for(j=0;j<s.length()/n;j++){
                    if(s.substring(j*n,n+j*n).equals(word)) count++;
                }
                if(j==count) return true;
            }
        }
        return false;
    }
}