class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();
        for(int i = 0; i < n; i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') count++;
        }
        if(count == n) return true;
        if(count == n-1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') return true;
        count = 0;
        for(int i = 0; i < n; i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') count++;
        }

        if(count == n) return true;
        return false;
    }
}