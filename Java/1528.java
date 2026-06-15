class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(indices[i],s.charAt(i));
        }
        String word = "";
        for(int i = 0; i < s.length(); i++){
            word += map.get(i);
        }
        return word;
    }
}