import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        for(int i = 1; i <= n; i++) str.add(String.valueOf(i));
        Collections.sort(str);
        for(int i = 0; i < n; i++) lst.add(Integer.valueOf(str.get(i)));
        return lst;
    }
}