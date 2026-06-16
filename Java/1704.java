class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> lst = List.of('a','e','i','o','u','A','E','I','O','U');
        int left = 0, right = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(lst.contains(s.charAt(i))) left++;
            if(lst.contains(s.charAt(s.length()-i-1))) right++;
        }
        return left == right;
    }
}