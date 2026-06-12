class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1, count = 0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i)==s.charAt(j-1)){
                    j--;
                    count++;
                }
                else if(s.charAt(i+1)==s.charAt(j)){
                    i++;
                    count++;
                }
                else{
                    count += 2;
                    break;
                }
            }
            i++;
            j--;
        }
        if(count<=1) return true;
        i = 0; 
        j = n-1; 
        count = 0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i+1)==s.charAt(j)){
                    i++;
                    count++;
                }
                else if(s.charAt(i)==s.charAt(j-1)){
                    j--;
                    count++;
                }
                else{
                    count += 2;
                    break;
                }
            }
            i++;
            j--;
        }
        if(count<=1) return true;
        return false;
    }
}