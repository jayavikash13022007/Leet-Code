import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> lst = new ArrayList<>();
        String str = "";
        for(int i = 1; i <= n; i++){
            str = "";
            if(i%3 == 0) str += "Fizz";
            if(i%5 == 0) str += "Buzz";
            if(str.length() > 0) lst.add(str);
            else lst.add(String.valueOf(i));
        }
        return lst;
    }
}