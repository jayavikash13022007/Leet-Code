class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE,count = 0,flag = 0;
        char chr;
        for(int i = 0; i < strs.length; i++){
            if(min > strs[i].length()) min = strs[i].length();
        }
        for(int i = 0; i < min; i++){
            flag = 0;
            chr = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != chr){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) count++;
            else break;
        }
        return strs[0].substring(0,count);
    }
}