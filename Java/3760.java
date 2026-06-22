class Solution {
    public int maxDistinct(String s) {
        int[] lst = new int[26];
        for(int i = 0; i < s.length(); i++) lst[s.charAt(i)-97]++;
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(lst[i] > 0) count++;
        }
        return count;
    }
}