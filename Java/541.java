import java.util.*;
class Solution {
    public String reverseStr(String s, int k) {
        ArrayList<String> lst = new ArrayList<>();
        String word = "";
        for(int i = 0; i < s.length(); i += k){
            try{
                lst.add(s.substring(i,i+k));
            }
            catch(Exception e){
                lst.add(s.substring(i));
            }
        }
        for(int i = 0; i < lst.size(); i++){
            if(i%2 == 1) word += lst.get(i);
            else{
                for(int j = lst.get(i).length()-1; j >= 0; j--){
                    word += lst.get(i).charAt(j);
                }
            }
        }
        return word;
    }
}