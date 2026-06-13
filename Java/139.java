class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] == 1 && wordDict.contains(s.substring(j,i))){
                    dp[i] = 1;
                    break;
                }
            }
        }
        return dp[n] == 1;
    }
}