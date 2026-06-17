class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(),word2.length());
        String word = "";
        for(int i = 0; i < n; i++) word += word1.charAt(i) + "" + word2.charAt(i);
        if(word1.length() > word2.length()) word += word1.substring(n);
        if(word2.length() > word1.length()) word += word2.substring(n);
        return word;
    }
}