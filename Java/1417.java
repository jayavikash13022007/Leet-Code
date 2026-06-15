import java.util.*;
class Solution {
    public String reformat(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> number = new ArrayList<>();
        String word = "";
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') number.add(s.charAt(i));
            else letter.add(s.charAt(i));
        }
        if(letter.size() - number.size() > 1 || number.size() - letter.size() > 1) return "";
        if(letter.size() > number.size()){
            for(int i = 0; i < number.size(); i++) word += "" + letter.get(i) + number.get(i);
            word += letter.get(letter.size()-1);
        }
        else{
            for(int i = 0; i < letter.size(); i++) word += "" + number.get(i) + letter.get(i);
            if(letter.size() != number.size()) word += number.get(number.size()-1);
        }
        return word;
    }
}