import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> d = new HashMap<>();
        ArrayList<Character> lst = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            try{
                d.put(s.charAt(i),d.get(s.charAt(i)) + 1);
            }
            catch(Exception e){
                d.put(s.charAt(i),1);
                lst.add(s.charAt(i));
                idx.add(i);
            }
        }
        for(int i=0;i<lst.size();i++){
            if(d.get(lst.get(i)) == 1) return idx.get(i); 
        }
        return -1;
    }
}