class Solution {
    public boolean rotateString(String s, String goal) {
        String word = "";
        for(int i = 0; i < goal.length(); i++){
            word = s.substring(i) + s.substring(0,i);
            if(word.equals(goal)) return true;
        }
        return false;
    }
}