import java.util.*;
class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<String> lst = new ArrayList<>();
        int k = 0, count = 0, a = 0, b = 0;
        int n = s.length();
        for(int i = 1; i < n; i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                lst.add(s.substring(k,i));
                k = i;
            }
        }
        lst.add(s.substring(k));
        for(int i = 1; i < lst.size(); i++){
            if(lst.get(i-1).charAt(0) != lst.get(i).charAt(0)){
                a = lst.get(i-1).length();
                b = lst.get(i).length();
                if(a>b) count += b;
                else count += a;
            }
        }
        return count;
    }
}