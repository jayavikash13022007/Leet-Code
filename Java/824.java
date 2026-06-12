import java.util.*;
class Solution {
    public String toGoatLatin(String sentence) {
        String vowel = "aeiouAEIOU", word = "",a = "";
        ArrayList<String> lst = new ArrayList<>();
        int k = 0,flag = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                lst.add(sentence.substring(k,i));
                k = i+1;
            }
        }
        lst.add(sentence.substring(k));
        for(int i = 0; i < lst.size(); i++){
            flag = 1;
            for(int j = 0; j < 10; j++){
                if(lst.get(i).charAt(0) == vowel.charAt(j)){
                    flag = 0;
                    break;
                }
            }
            word += lst.get(i).substring(flag) + lst.get(i).substring(0,flag) + "ma";
            a += "a";
            word += a;
            if(i!=lst.size()-1) word += " ";
        }
        return word;
    }
}