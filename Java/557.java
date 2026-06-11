import java.util.ArrayList;
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> lst = new ArrayList<>();
        int n = s.length();
        int k = 0;
        String word = "";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                lst.add(s.substring(k,i));
                k = i + 1;
            }
        }
        lst.add(s.substring(k));
        for(int j = lst.get(0).length() - 1; j >= 0; j--) word += lst.get(0).charAt(j);
        for(int i = 1; i < lst.size(); i++){
            word += " ";
            for(int j = lst.get(i).length() - 1; j >= 0; j--) word += lst.get(i).charAt(j);
        }
        return word;
    }
}