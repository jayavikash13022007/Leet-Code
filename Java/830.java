import java.util.*;
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int k = 0;
        List<List<Integer>> lst = new ArrayList<>();
        for(int i = 1; i < s.length(); i ++){
            if(s.charAt(i) != s.charAt(i-1)){
                if(i-k >= 3) lst.add(new ArrayList<>(Arrays.asList(k,i-1)));
                k = i;
            }
        }
        if(s.length()-k >= 3) lst.add(new ArrayList<>(Arrays.asList(k,s.length()-1)));
        return lst;
    }
}