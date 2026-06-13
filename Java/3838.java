class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String word = "";
        int total;
        for(int i = 0; i < words.length; i++){
            total = 0;
            for(int j = 0; j < words[i].length(); j++) total += weights[(int)(words[i].charAt(j)) - 97];
            word += (char)(122 - total%26);
        }
        return word;
    }
}