import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> d = new HashMap<>();
        ArrayList<Character> lst = new ArrayList<>();
        int flag = 0;
        int total = 0;
        for(int i=0;i<s.length();i++){
            try{
                d.put(s.charAt(i),d.get(s.charAt(i)) + 1);
            }
            catch(Exception e){
                d.put(s.charAt(i),1);
                lst.add(s.charAt(i));
            }
        }
        for(int i=0;i<lst.size();i++){
            if(d.get(lst.get(i))%2 != 0) flag = 1;
            total += d.get(lst.get(i))/2 * 2;
        }
        return total + flag;
    }
}