import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> d = new HashMap<>();
        ArrayList<Character> p = new ArrayList<>();
        ArrayList<String> lst = new ArrayList<>();
        for(int i=0;i<pattern.length();i++){
            p.add(pattern.charAt(i));
        }
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                lst.add(s.substring(start,i));
                start = i+1;
            }
        }
        lst.add(s.substring(start));
        if(p.size() != lst.size()){
            return false;
        }
        for(int i=0;i<lst.size();i++){
            if(!d.containsKey(p.get(i))){
                d.put(p.get(i),lst.get(i));
            }
            else{
                if(!(d.get(p.get(i))).equals(lst.get(i))){
                    return false;
                }
            }
        }
        HashMap<String,Character> m = new HashMap<>();
        for(int i=0;i<lst.size();i++){
            if(!m.containsKey(lst.get(i))){
                m.put(lst.get(i),p.get(i));
            }
            else{
                if(!(m.get(lst.get(i))).equals(p.get(i))){
                    return false;
                }
            }
        }
        return true;
    }
}