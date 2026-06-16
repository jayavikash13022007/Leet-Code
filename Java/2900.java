class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);
        int val = groups[0];
        for(int i = 1; i < words.length; i++){
            if(groups[i] != val){
                lst.add(words[i]);
                val = groups[i];
            }
        }
        return lst;
    }
}