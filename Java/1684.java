class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> lst = new ArrayList<>();
        for(int i = 0; i < allowed.length(); i++) lst.add(allowed.charAt(i));
        int count = 0,flag = 1;
        for(int i = 0; i < words.length;i++){
            flag = 1;
            for(int j = 0; j < words[i].length();j++){
                if(!lst.contains(words[i].charAt(j))){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) count++;
        }
        return count;
    }
}