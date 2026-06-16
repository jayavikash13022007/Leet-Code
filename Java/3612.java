import java.util.*;
class Solution {
    public String processStr(String s) {
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#') word.append(word);
            else if(s.charAt(i) == '*'){
                if(word.length()>0) word.deleteCharAt(word.length()-1);
            }
            else if(s.charAt(i) == '%') word.reverse();
            else word.append(s.charAt(i));
        }
        return String.valueOf(word);
    }
}