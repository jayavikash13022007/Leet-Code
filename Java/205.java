class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a = new char[s.length()];
        char[] b = new char[t.length()];
        int k = 0;
        for(int i=0;i<s.length();i++){
            int flag = 0;
            for(int j=0;j<k;j++){
                if(s.charAt(i) == a[j]){
                    if(t.charAt(i) == b[j]){
                        flag = 1;
                    }
                    else{
                        return false;
                    }
                }
                if(t.charAt(i) == b[j]){
                    if(s.charAt(i) == a[j]){
                        flag = 1;
                    }
                    else{
                        return false;
                    }
                }
            }
            if(flag == 0){
                a[k] = s.charAt(i);
                b[k] = t.charAt(i);
                k++; 
            }
        }
        return true;
    }
}